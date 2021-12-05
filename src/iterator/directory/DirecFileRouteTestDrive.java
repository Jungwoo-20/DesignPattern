package iterator.directory;

import java.io.File;

public class DirecFileRouteTestDrive {
    public static void main(String[] args) {
        File path = new File("input Path");
        File[] files = path.listFiles();
        Node node = new Directory("20211114 디자인 패턴 파일 경로 출력 과제");
        System.out.println("출력양식은");
        System.out.println("폴더명");
        System.out.println("----------파일명");
        System.out.println("입니다.");
        if (files.length > 0) {
            for (int i = 0; i < files.length; i++) {
                // 폴더인 경우
                if (files[i].isDirectory()) {
                    Node directory = new Directory(files[i].getName());
                    node.add(directory);
                }
                // 파일인 경우
                else {
                    Node file = new iterator.directory.File(files[i].getName());
                    node.add(file);
                }
            }
        }
        FileSystem fileSystem = new FileSystem(node);
        fileSystem.print();
    }
}
