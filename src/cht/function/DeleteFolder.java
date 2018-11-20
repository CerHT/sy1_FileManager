package cht.function;

import java.io.File;

public class DeleteFolder {

    public boolean deleteFile(File path) {
        if (path.exists() && path.isFile()) {
            if (path.delete()) {
                System.out.println("文件删除successed");
                return true;
            } else {
                System.out.println("failed");
                return false;
            }
        } else {
            System.out.println("删除失败");
            return false;
        }
    }


    public boolean deleteDirectory(File path) {
        if ((!path.exists()) || (!path.isDirectory())) {
            System.out.println("目录不存在");
            return false;
        }
        boolean flag = true;
        File[] files = path.listFiles();
        if (files != null && files.length != 0) {
            for (File file : files) {
                if (file.isFile()) {
                    flag = deleteFile(file);
                    if (!flag)
                        break;
                } else if (file.isDirectory()) {
                    flag = deleteDirectory(file);
                    if (!flag)
                        break;

                }
            }
        }
        if (!flag) {
            System.out.println("删除目录失败");
            return false;
        }
        if (path.delete()) {
            System.out.println("删除目录成功");
            return true;
        } else {
            return false;
        }
    }
}
