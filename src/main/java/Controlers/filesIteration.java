package Controlers;

import models.ReferenceSheetFeatures;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class filesIteration {


    public static void getFolderImagesAndConvert(String folderActualImages, String folderNewImages) {
        String path = folderActualImages;
        String[] files = getFiles(path);

        if (files != null) {

            int size = files.length;

            for (int i = 0; i < size; i++) {
                System.out.println("------------------------------------------------------------------");
                System.out.println("Imagen a convertir " + files[i]);
                ImageManagement imageManagement = new ImageManagement();
                ReferenceSheetFeatures referenceSheetFeatures = new ReferenceSheetFeatures(1123, 796);
                String[] nameCurrentFile = files[i].replace("\\", "/").split("/");
                imageManagement.copyImage(files[i], folderNewImages + nameCurrentFile[nameCurrentFile.length - 1] + ".jpg", referenceSheetFeatures);
                System.out.println("Convertida con el nombre " + nameCurrentFile[nameCurrentFile.length - 1]);

                System.out.println("------------------------------------------------------------------");
            }
        }


    }


    private static String[] getFiles(String dir_path) {

        String[] arr_res = null;

        File f = new File(dir_path);

        if (f.isDirectory()) {

            List<String> res = new ArrayList<>();
            File[] arr_content = f.listFiles();

            int size = arr_content.length;

            for (int i = 0; i < size; i++) {

                if (arr_content[i].isFile())
                    res.add(arr_content[i].toString());
            }


            arr_res = res.toArray(new String[0]);

        } else
            System.err.println("¡ Path NO válido !");


        return arr_res;
    }
}
