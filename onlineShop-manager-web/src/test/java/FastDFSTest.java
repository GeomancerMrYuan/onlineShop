import com.yp.common.util.FastDFSClient;
import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient;
import org.csource.fastdfs.StorageServer;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * desc
 *
 * @Author 袁朋
 * @Date 2019/4/9
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:springs/springmvc.xml")
public class FastDFSTest {

    @Value("${IMAGE_SERVER_URL}")
    private String IMAGE_SERVER_URL;

    @Test
    public void testFileUpload() throws Exception {
        // 1、加载配置文件，配置文件中的内容就是 tracker 服务的地址。
        ClientGlobal.init("conf/config.properties");
        // 2、创建一个 TrackerClient 对象。直接 new 一个。
        TrackerClient trackerClient = new TrackerClient();
        // 3、使用 TrackerClient 对象创建连接，获得一个 TrackerServer 对象。
        TrackerServer trackerServer = trackerClient.getConnection();
        // 4、创建一个 StorageServer 的引用，值为 null
        StorageServer storageServer = null;
        // 5、创建一个 StorageClient 对象，需要两个参数 TrackerServer 对象、StorageServer 的引用
        StorageClient storageClient = new StorageClient(trackerServer, storageServer);
        // 6、使用 StorageClient 对象上传图片。
        //扩展名不带“.”
        String[] strings = storageClient.upload_file("/Users/mryuan/IdeaProjects/onlineShop/onlineShop-manager-web/src/main/resources/1.jpg", "jpg", null);
        // 7、返回数组。包含组名和图片的路径。
        for (String string : strings) {
            System.out.println(string);
        }
    }

    @Test
    public void testFastDFSClient() throws Exception {
        //创建一个FastDFSClient对象
        FastDFSClient fastDFSClient = new FastDFSClient("conf/config.properties");
        //使用对象上传文件，返回文件路径
        String result = fastDFSClient.uploadFile("/Users/mryuan/IdeaProjects/onlineShop/onlineShop-manager-web/src/main/resources/1.jpg");
        //打印结果
        System.out.println(result);
    }

    @Test
    public void testProperties() {
        System.out.println(IMAGE_SERVER_URL);
    }
}

