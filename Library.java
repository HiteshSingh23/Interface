package interfaceconfig;

import java.io.File;

public class Library {

    public static void main(String[] args) {

        String configpath = "C:\\Users\\hitesh\\Ideaprojects\\DataSets\\configfile.txt";

        Filerws f0 = new Filerws();

        String configlines = f0.readfromfile(configpath);
        String[] filepaths = configlines.split("\n");
        System.out.println("filepaths and names are " + filepaths[0] + filepaths[1] + filepaths[2]);

        Filerws f1 = new Filerws();
        String Libname = f1.readfromfile(filepaths[0]);
        System.out.println("content of first file " + Libname);

        Filerws f2 = new Filerws();
        String libbooks = f2.readfromfile(filepaths[1]);
        System.out.println("content of 2nd file " + libbooks);

        SetLib sl = new SetLib();
        String[] names = Libname.split(",");
        String[] books = libbooks.split("\n");

        String[] details;
        String filecontent = "";

        for (String s : books) {
            details = s.split(",");

            filecontent += sl.setCollegeName(names[0]); // collegename
            filecontent += sl.setLibName(names[1]);   // libname
            filecontent += sl.setCityname(names[2]);   // cityname

            filecontent += sl.setTitle(details[0]); // Title
            filecontent += sl.setAuthor(details[1]); // Author
            filecontent += sl.setYear(details[2]); // Year
            filecontent += sl.setPublisher(details[3]); // Publisher
            filecontent += sl.setBookPrice(details[4]);   // price
            filecontent += "\n";


        }
        Filerws f3 = new Filerws();
        System.out.println("assembled file content " + filecontent);
        f3.writeToFile(filecontent, filepaths[2]);
    }
}
