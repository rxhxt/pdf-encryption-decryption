package project;
import java.util.Scanner;
import java.io.File;
import javax.swing.JFileChooser;

public class Ui {

    public static String path = new String();
    private JFileChooser upfile;
    public static String fname = new String();
    public static String fileFormat = new String();


    public void getpath()
    {
        String p = new String();

        upfile = new JFileChooser("c:");
        upfile.showSaveDialog(null);
        String filename = new String();
        p = upfile.getSelectedFile().getAbsolutePath();
        path = p;
        filename = upfile.getSelectedFile().getName();
        String parts[] = filename.split("\\.",2);
        fname = parts[0];
        fileFormat = parts[1];


        System.out.println(path);
        System.out.println(fname);
        System.out.println(fileFormat);

    }


    public void getfileName()
    {
        String file = new String();
        JFileChooser fileName = new JFileChooser("c:");
        file = fileName.getSelectedFile().getName();
        String[] filefinal = new String[2];
        filefinal = file.split(".",2);
        System.out.println(file);
        fname = filefinal[0];
        System.out.println(fname);

    }

    public void getfileFormat()
    {
        String file = new String();
        JFileChooser fileName = new JFileChooser("c:");
        file = fileName.getSelectedFile().getName();
        String[] filefinal = new String[2];
        filefinal = file.split(".",2);
        fileFormat = filefinal[1];
        System.out.println(fileFormat);

    }


}