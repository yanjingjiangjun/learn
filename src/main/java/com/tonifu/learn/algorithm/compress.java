package com.tonifu.learn.algorithm;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Iterator;

/**
 * @Author fuj
 * @Date 2023-01-09 12:30
 * @PackageName:com.tonifu.learn.algorithm
 * @ClassName: compress
 * @Description: TODO
 * @Version 1.0
 */
public class compress {
    public static void main(String[] args) {
        try {
            compare();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void compare() throws Exception{
        long start1 = System.currentTimeMillis();
        for (int i = 0; i < 1; i++) {

            Iterator readers = ImageIO.getImageReadersByFormatName("jpg");
            ImageReader reader = (ImageReader) readers.next();
            File file = new File("/Users/fujian/Pictures/bindService流程图.jpg");
            ImageInputStream input = ImageIO.createImageInputStream(file);
            reader.setInput(input, true);
            int width = reader.getWidth(0);
            int height = reader.getHeight(0);
            //System.out.println(width + "/" + height);
        }

        long end1 = System.currentTimeMillis();

        System.out.println(end1 - start1);
       /* long start2 = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            File file = new File("d://1.png");
            BufferedImage bi = ImageIO.read(file);
            int width = bi.getWidth();
            int height = bi.getHeight();
            //System.out.println(width + "/" + height);
        }

        long end2 = System.currentTimeMillis();
        System.out.println(end2 - start2);*/
    }
}
