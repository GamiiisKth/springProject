/**
 * Created by joshuaPro on 2016-01-18.
 */
public class Triangle {

    // the value for this variable will be associate from spring.xml
    /**
     *  <bean id="triangle" class="Triangle">
     <property name="type" value="Equilateral"/>
     </bean>
     */
    private String type;
    private  int height;


   public Triangle(String type){
        this.type=type;
    }
    public Triangle(int height){
        this.height=height;
    }
    public Triangle(String type,int height){
        this.type=type;
        this.height=height;
    }

    public int getHeight() {
        return height;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void draw(){
        System.out.println(getType()+  " triangle with height: "+ getHeight() +" is drawn"   );
    }
}
