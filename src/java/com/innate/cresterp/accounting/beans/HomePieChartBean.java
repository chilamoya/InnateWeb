/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.innate.cresterp.accounting.beans;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.model.chart.PieChartModel;

/**
 *
 * @author TINASHE
 */
@ManagedBean
@RequestScoped

public class HomePieChartBean {

    private final PieChartModel model;

    public HomePieChartBean() {
        model = new PieChartModel();
        model.set("Brand 1", 540);
        model.set("Brand 2", 325);
        model.set("Brand 3", 702);
        model.set("Brand 4", 421);
        model.setTitle("Custom Pie");
        model.setLegendPosition("e");
        model.setShowDataLabels(true);
        model.setDiameter(150);
        model.setFill(true);
    }

    public PieChartModel getModel() {
        return model;
    }
}
