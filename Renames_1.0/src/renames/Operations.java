package renames;

import java.io.File;

import static renames.Constants.*;

public class Operations {

    // 替代文本操作
    public static void RunOperator1(String key) {
        if (key != null) {
            oldT = tf2.getText();
            newT = tf3.getText();
            // 新建文件的目录对象
            File dir = new File(key);
            // 获取当前目录下所有的文件
            File[] fs = dir.listFiles();
            // 需要被替换或删除的文字
            String deleteText = oldT;
            for (File file : fs) {
                if (file.getName().contains(deleteText)) {
                    String newFileName = file.getName().replace(deleteText, newT);
                    file.renameTo(new File(dir, newFileName));
                }
            }
            tf4.setText("替换操作成功");
        } else {
            tf4.setText("操作不成功，原因：路径不正确");
        }
    }

    // 当前文件的文件名列表
    public static void RunOperator3(String key) {
        File dir = new File(key);

        if (dir.isDirectory()) {
            String f1;
            StringBuilder sb = new StringBuilder();
            File[] fs = dir.listFiles();
            for (int i = 0; i < fs.length; i++) {
                File file = fs[i];
                f1 = file.getName();
                sb.append(f1);
                sb.append("\r\n");
            }
            ta1.setText(sb.toString());
            tf4.setText("操作成功");
        } else {
            tf4.setText("操作不成功，原因：路径不是文件夹");
        }
    }

    // 数字化操作
    public static void RunOperator2(String key) {
        File dir = new File(key);
        // 获取当前目录下所有的文件
        File[] fs = dir.listFiles();
        // 需要被替换或删除的文字
        String newFileName = null;
        // 把一到二十的汉字替换成数字
        for (File file : fs) {

            if (file.getName().contains("二十")) {
                newFileName = file.getName().replace("二十", "20");
                file.renameTo(new File(dir, newFileName));
            } else if (file.getName().contains("十一")) {
                newFileName = file.getName().replace("十一", "11");
                file.renameTo(new File(dir, newFileName));
            } else if (file.getName().contains("十二")) {
                newFileName = file.getName().replace("十二", "12");
                file.renameTo(new File(dir, newFileName));
            } else if (file.getName().contains("十三")) {
                newFileName = file.getName().replace("十三", "13");
                file.renameTo(new File(dir, newFileName));
            } else if (file.getName().contains("十四")) {
                newFileName = file.getName().replace("十四", "14");
                file.renameTo(new File(dir, newFileName));
            } else if (file.getName().contains("十五")) {
                newFileName = file.getName().replace("十五", "15");
                file.renameTo(new File(dir, newFileName));
            } else if (file.getName().contains("十六")) {
                newFileName = file.getName().replace("十六", "16");
                file.renameTo(new File(dir, newFileName));
            } else if (file.getName().contains("十七")) {
                newFileName = file.getName().replace("十七", "17");
                file.renameTo(new File(dir, newFileName));
            } else if (file.getName().contains("十八")) {
                newFileName = file.getName().replace("十八", "18");
                file.renameTo(new File(dir, newFileName));
            } else if (file.getName().contains("十九")) {
                newFileName = file.getName().replace("十九", "19");
                file.renameTo(new File(dir, newFileName));
            } else if (file.getName().contains("一")) {
                newFileName = file.getName().replace("一", "1");
                file.renameTo(new File(dir, newFileName));
            } else if (file.getName().contains("二")) {
                newFileName = file.getName().replace("二", "2");
                file.renameTo(new File(dir, newFileName));
            } else if (file.getName().contains("三")) {
                newFileName = file.getName().replace("三", "3");
                file.renameTo(new File(dir, newFileName));
            } else if (file.getName().contains("四")) {
                newFileName = file.getName().replace("四", "4");
                file.renameTo(new File(dir, newFileName));
            } else if (file.getName().contains("五")) {
                newFileName = file.getName().replace("五", "5");
                file.renameTo(new File(dir, newFileName));
            } else if (file.getName().contains("六")) {
                newFileName = file.getName().replace("六", "6");
                file.renameTo(new File(dir, newFileName));
            } else if (file.getName().contains("七")) {
                newFileName = file.getName().replace("七", "7");
                file.renameTo(new File(dir, newFileName));
            } else if (file.getName().contains("八")) {
                newFileName = file.getName().replace("八", "8");
                file.renameTo(new File(dir, newFileName));
            } else if (file.getName().contains("九")) {
                newFileName = file.getName().replace("九", "9");
                file.renameTo(new File(dir, newFileName));
            } else if (file.getName().contains("十")) {
                newFileName = file.getName().replace("十", "10");
                file.renameTo(new File(dir, newFileName));
            }
        }
        tf4.setText("操作成功");
    }
}
