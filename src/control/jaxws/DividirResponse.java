
package control.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "DividirResponse", namespace = "http://control/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DividirResponse", namespace = "http://control/")
public class DividirResponse {

    @XmlElement(name = "return", namespace = "")
    private float _return;

    /**
     * 
     * @return
     *     returns float
     */
    public float getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(float _return) {
        this._return = _return;
    }

}
