package baidu.composite;

/**
 * Created by langshiquan on 17/3/4.
 */
public class DemoClient {
    public static void main(String[] args) {
        AbstractFile f2,f3,f4,f5;
        Folder f1,f6;
        f1 = new Folder("我的收藏");
        f2 = new ImageFile("image2");
        f3 = new TextFile("text2");
        f1.add(f2);
        f1.add(f3);
        f4 = new VedioFile("vedio");
        f5 = new TextFile("text1");
        f6 = new Folder("my folder");
        f6.add(f4);
        f6.add(f1);
        f6.add(f5);

        f6.killVirus();


    }
}
