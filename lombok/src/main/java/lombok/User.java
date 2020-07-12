package lombok;

import java.io.FileInputStream;
import java.io.InputStream;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    private String id;
    private String name;
    private String desc;

    public static void main(String[] args) {

        // @NoArgsConstructor 生成
        new User();

        // @AllArgsConstructor 生成
        new User("juice-resume", "果汁简历", "专注于 Java 方向技术分享");

        // @Builder 生成
        User user = User.builder().id("juice-resume").name("果汁简历").desc("专注于 Java 方向技术分享").build();
    }

    // @SneakyThrows 自动生成 throws FileNotFoundException
    @SneakyThrows
    private void read() {
        // @Cleanup 相当于 inputStream.close();
        @Cleanup
        InputStream inputStream = new FileInputStream("");
    }

    /**
     * @Synchronized private final Object $lock = new Object[0];
     * public void write() {
     * synchronized(this.$lock) {
     * System.out.println("write");
     * }
     * }
     */

    @Synchronized
    public void write() {
        System.out.println("write");
    }
}
