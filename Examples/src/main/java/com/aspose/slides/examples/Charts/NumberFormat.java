/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package com.aspose.slides.examples.Charts;

import com.aspose.slides.*;
import com.aspose.slides.examples.Utils;

public class NumberFormat
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(NumberFormat.class);

        //Instantiate the Presentation1//Instantiate the Presentation1
        Presentation pres = new Presentation();

        //Access the first Presentation1 slide
        ISlide slide = pres.getSlides().get_Item(0);

        //Adding a default clustered column chart
        IChart chart = slide.getShapes().addChart(ChartType.ClusteredColumn, 50, 50, 500, 400);

        //Accessing the chart series collection
        IChartSeriesCollection series = chart.getChartData().getSeries();

        //Setting the preset number format
        //Traverse through every chart series
        for (IChartSeries ser : series)
        {
            //Traverse through every data cell in series
            for (IChartDataPoint cell : ser.getDataPoints())
            {
                //Setting the number format
                cell.getValue().getAsCell().setPresetNumberFormat((byte)10); //0.00%
            }
        }

        //Saving Presentation1
        pres.save(dataDir+ "PresetNumberFormat.pptx", SaveFormat.Pptx);


    }
}




