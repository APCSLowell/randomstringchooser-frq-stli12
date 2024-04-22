import java.util.*;
public class RandomStringChooser
{
  private ArrayList<String> valuesArr;
  public RandomStringChooser(String[] values  ){
    valuesArr = new ArrayList<String>();
    for(int i = 0; i < values.length; i ++){
        valuesArr.add(values[i]);
    }
  }
  public String getNext(){
    if( valuesArr.size() == 0)
      return "NONE";

    int index = (int)(Math.random() * valuesArr.size());
    return valuesArr.remove(index);

  }

}
