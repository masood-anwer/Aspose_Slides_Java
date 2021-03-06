/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package com.aspose.slides.examples.Slides;

import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.Utils;

import java.io.FileOutputStream;
import java.io.IOException;

public class CreateSlidesSVGImage
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(CreateSlidesSVGImage.class);
        //Instantiate a Presentation object that represents a PPTX file
        Presentation pres = new Presentation(dataDir+ "demo.pptx");

        //Getting last slide index
        int lastSlidePosition=pres.getSlides().size();
        ISlide slide =null;
        //Iterating through every Presentation1 slide and generating SVG image
        for (int i = 0; i < lastSlidePosition; i++)
        {
            //Accessing Slides
            slide = pres.getSlides().get_Item(i);

            //Getting and saving the slide SVG image
            try{
                slide.writeAsSvg(new FileOutputStream(dataDir+ "SvgImage" + i+ ".svg"));
            }
            catch(IOException e){}

        }
        System.out.println("Program executed successfully");
    }
}




