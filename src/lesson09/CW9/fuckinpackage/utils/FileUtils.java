package lesson09.CW9.fuckinpackage.utils;

import java.io.*;

public class FileUtils {

    public void write(String fileName, String text) {
        //���������� ����
        File file = new File(fileName);
        try {
            //���������, ��� ���� ���� �� ���������� �� ������� ���
            if (!file.exists()) {
                file.createNewFile();
            }
            //PrintWriter ��������� ����������� ������ � ����
            PrintWriter out = new PrintWriter(file.getAbsoluteFile());
            try {
                //���������� ����� � ����
                out.print(text);
            } finally {
                //����� ���� �� ������ ������� ����
                //����� ���� �� ���������
                out.close();
            }
        } catch (IOException ololo) {
            throw new RuntimeException(ololo);
        }
    }

    public String read(String fileName) throws FileNotFoundException {
        //���� ����. ������ ��� ���������� ������
        StringBuilder sb = new StringBuilder();
        exists(fileName);
        try {
            //������ ��� ������ ����� � �����
            File file = new File(fileName);
            BufferedReader in = new BufferedReader(new FileReader(file.getAbsoluteFile()));
            try {
                //� ����� ��������� ��������� ����
                String s;
                while ((s = in.readLine()) != null) {
                    sb.append(s);
                    sb.append("\n");
                }
            } finally {
                //����� �� �������� ������� ����
                in.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //���������� ���������� ����� � �����
        return sb.toString();
    }

    public void update(String nameFile, String newText) throws FileNotFoundException {
        exists(nameFile);
        StringBuilder sb = new StringBuilder();
        String oldFile = read(nameFile);
        sb.append(oldFile);
        sb.append(newText);
        write(nameFile, sb.toString());
    }

    private void exists(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        if (!file.exists()) {
            throw new FileNotFoundException(file.getName());
        }
    }
}
