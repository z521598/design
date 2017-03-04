package baidu.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by langshiquan on 17/3/4.
 */
// 抽象构建
public interface AbstractFile {
    void killVirus(); // 杀毒
}

class ImageFile implements AbstractFile {

    private String name;

    public ImageFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("图像文件" + name);
    }
}

class TextFile implements AbstractFile {

    private String name;

    public TextFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("文本文件" + name);
    }
}

class VedioFile implements AbstractFile {

    private String name;

    public VedioFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("视频文件" + name);
    }
}

class Folder implements AbstractFile {

    private String name;
    // 容器，用于存放容器下构建的子节点
    private List<AbstractFile> list = new ArrayList<AbstractFile>();

    public Folder(String name) {
        super();
        this.name = name;
    }

    public void add(AbstractFile file) {
        list.add(file);
    }

    public void remove(AbstractFile file) {
        list.remove(file);
    }

    public AbstractFile getChild(int index) {
        return list.get(index);
    }

    @Override
    public void killVirus() {
        System.out.println("对" + name + "文件夹查杀");
        // 递归
        for (AbstractFile file : list) {
            file.killVirus();
        }
    }
}
