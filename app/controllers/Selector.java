package controllers;

import models.Data;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.show;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by udbhav.singh on 9/2/16.
 */
public class Selector extends Controller{

  public Result show() {
    Data d1 = new Data();
    d1.name = "number 1";
    d1.type = "basic";

    Data d2 = new Data();
    d2.name = "number 2";
    d2.type = "complex";
    List<Data> dataList = new ArrayList<>();
    dataList.add(d1);
    dataList.add(d2);
    return ok(show.render(dataList));
  }

}
