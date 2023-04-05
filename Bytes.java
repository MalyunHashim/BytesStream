package BytesStream;

import java.io.*;

public class Bytes {
    public static void main(String[] args) throws IOException {


        FileInputStream in = null;
        FileOutputStream out = null;
        try{
                File obj =new File("input.txt");
                File Obj=new File("output.txt");

                FileWriter myFile=new FileWriter("input.txt");
                myFile.write("Files in Java might be tricky, but it is fun enough");
                myFile.close();
                System.out.println("the file successfully done:");

                FileWriter MyFile=new FileWriter("output.txt");
                MyFile.write("To create a file in a specific directory");
                MyFile.close();
                System.out.println("the file successfully done");


                if(obj.createNewFile()){
                    System.out.println("File created "+obj.getName());
                }else{
                    System.out.println("the file already exists");
                }

                if(Obj.createNewFile()){
                    System.out.println("file created: "+ Obj.getName());
                }else{
                    System.out.println("The file already exists");
                }


                in = new FileInputStream("input.txt");
                out=new FileOutputStream("output.txt");

                int c;
                while((c=in.read())!= -1){
                    out.write(c);

                }


            }catch(IOException e){
                System.out.println("error occurs");
            }
            finally {
                        if(in !=null){
                        in.close();

                }
                if(out !=null){
                    out.close();
                }
            }
        }
    }