
package control.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "Dividir", namespace = "http://control/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dividir", namespace = "http://control/", propOrder = {
    "num1",
    "num2"
})
public class Dividir {

    @XmlElement(name = "num1", namespace = "")
    private float num1;
    @XmlElement(name = "num2", namespace = "")
    private float num2;

    /**
     * 
     * @return
     *     returns float
     */
    public float getNum1() {
        return this.num1;
    }

    /**
     * 
     * @param num1
     *     the value for the num1 property
     */
    public void setNum1(float num1) {
        this.num1 = num1;
    }

    /**
     * 
     * @return
     *     returns float
     */
    public float getNum2() {
        return this.num2;
    }

    /**
     * 
     * @param num2
     *     the value for the num2 property
     */
    public void setNum2(float num2) {
        this.num2 = num2;
    }

}
