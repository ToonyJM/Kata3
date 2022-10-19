package kata3;

import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

public class HistogramDisplay extends ApplicationFrame {

    public HistogramDisplay(String title) {
        super("HISTOGRAMA");
        this.setContentPane(createPanel());
        this.pack();
    }
    
    public void execute(){
        this.setVisible(true);
    }

    private JPanel createPanel() {
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        chartPanel.setPreferredSize(new Dimension(500,400));
        return chartPanel;
    }
    
    private JFreeChart createChart(DefaultCategoryDataset dataset){
        JFreeChart chart = ChartFactory.createBarChart("Histograma",
                                                       "Dominios email",
                                                       "Nº emails",
                                                       dataset,
                                                       PlotOrientation.VERTICAL,
                                                       false,
                                                       false,
                                                       rootPaneCheckingEnabled);
        
        return chart;
    }
    
    private DefaultCategoryDataset createDataset(){
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(6,"","ulpgc.es");
        dataset.addValue(2,"","dis.ulpgc.es");
        dataset.addValue(9,"","eii.ulpgc.es");
        dataset.addValue(1,"","gmail.com");
        dataset.addValue(5,"","hotmail.es");
        return dataset;
    }
    
    
}
