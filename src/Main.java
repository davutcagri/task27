import java.io.*;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Davut Çağrı", "Akbıyık", 19, 76);
        Student student2 = new Student("Ali", "Yurtseven", 20, 95);

        saveStudent(student1.getName(), student1.getSurname(), student1.getAge(), student1.getAverage());
        saveStudent(student2.getName(), student2.getSurname(), student2.getAge(), student2.getAverage());

        showDetails();
    }

    public static void saveStudent(String name, String surname, int age, double average) {
        String filePath = "D:\\work\\task27\\src\\test.txt";
        File f = new File(filePath);

        if (f.exists()) {
            try {
                FileWriter fileWriter = new FileWriter(filePath, true);//File Writer oluşturuldu ve append değeri true yapıldı ki veri üzerine yazmasın
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write("-----------------\nName: " + name + "\nSurname: " + surname + "\nAge: " + age + "\nAverage: " + average + "\n");//yazıldı
                bufferedWriter.close();//buffered kapatıldı
                fileWriter.close();//filewriter kapatıldı
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            try {
                f.createNewFile();//eğer file yoksa yeni file oluşturuyor
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void showDetails() {
        String filePath = "D:\\work\\task27\\src\\test.txt";
        File f = new File(filePath);

        if (f.exists()) {
            try {
                FileReader fileReader = new FileReader(filePath);//okuyucu oluşturuldu
                int ch = fileReader.read(); //dosya karakter karakter okunuyor ve her karakterin değerini ch ye eşitliyoruz
                while (ch != -1) {
                    System.out.print((char) ch);//karakterler tek tek ekrana yazılıyor
                    ch = fileReader.read();//her seferinde ch değeri geldiği karaktere eşitleniyor
                }
                fileReader.close();//reader kapatıldı
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            try {
                f.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}