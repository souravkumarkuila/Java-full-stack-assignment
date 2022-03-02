import java.io.*;
public class javaassignment4 {
        public static void main(String[] args) throws IOException {
            File file=new File("C:\\Users\\sourav kumar kuila\\IdeaProjects\\java11assignment\\src\\StudentList");
            FileInputStream fileInputStream=new FileInputStream(file);
            InputStreamReader inputStreamReader=new InputStreamReader(fileInputStream);
            BufferedReader br=new BufferedReader(inputStreamReader);
            StringBuffer sb=new StringBuffer();
            String line;
            int count=0;
            while ((line=br.readLine())!=null){
                sb.append(line);
                sb.append(", ");
                String words[]=line.split("");
                count=count+words.length;
            }
            System.out.println("contents of file:");
            System.out.println(sb.toString()+"end");
            System.out.println("number of words present in file"+count);
            br.close();
        }

    }

