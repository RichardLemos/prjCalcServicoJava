
package control.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "Soma", namespace = "http://control/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Soma", namespace = "http://control/", propOrder = {
    "num1",
    "num2"
})
public class Soma {

    @XmlElement(name = "num1", namespace = "")
    private int num1;
    @XmlElement(name = "num2", namespace = "")
    private int num2;

    /**
     * 
     * @return
     *     returns int
     */
    public int getNum1() {
        return this.num1;
    }

    /**
     * 
     * @param num1
     *     the value for the num1 property
     */
    public void setNum1(int num1) {
        this.num1 = num1;
    }

    /**
     * 
     * @return
     *     returns int
     */
    public int getNum2() {
        return this.num2;
    }

    /**
     * 
     * @param num2
     *     the value for the num2 property
     */
    public void setNum2(int num2) {
        this.num2 = num2;
    }

}
