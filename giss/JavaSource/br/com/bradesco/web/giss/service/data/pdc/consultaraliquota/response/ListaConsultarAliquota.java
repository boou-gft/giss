/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ListaConsultarAliquota.java,v 1.3 2017/12/08 17:29:21 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.consultaraliquota.response;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.math.BigDecimal;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * Class ListaConsultarAliquota.
 * 
 * @version $Revision: 1.3 $ $Date: 2017/12/08 17:29:21 $
 */
public class ListaConsultarAliquota implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codMunicipio
     */
    private long _codMunicipio = 0;

    /**
     * keeps track of state for field: _codMunicipio
     */
    private boolean _has_codMunicipio;

    /**
     * Field _descMunicipio
     */
    private java.lang.String _descMunicipio;

    /**
     * Field _codUf
     */
    private int _codUf = 0;

    /**
     * keeps track of state for field: _codUf
     */
    private boolean _has_codUf;

    /**
     * Field _siglaUf
     */
    private java.lang.String _siglaUf;

    /**
     * Field _aliquota
     */
    private java.math.BigDecimal _aliquota = new java.math.BigDecimal("0");


      //----------------/
     //- Constructors -/
    //----------------/

    public ListaConsultarAliquota() 
     {
        super();
        setAliquota(new java.math.BigDecimal("0"));
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultaraliquota.response.ListaConsultarAliquota()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodMunicipio
     * 
     */
    public void deleteCodMunicipio()
    {
        this._has_codMunicipio= false;
    } //-- void deleteCodMunicipio() 

    /**
     * Method deleteCodUf
     * 
     */
    public void deleteCodUf()
    {
        this._has_codUf= false;
    } //-- void deleteCodUf() 

    /**
     * Returns the value of field 'aliquota'.
     * 
     * @return BigDecimal
     * @return the value of field 'aliquota'.
     */
    public java.math.BigDecimal getAliquota()
    {
        return this._aliquota;
    } //-- java.math.BigDecimal getAliquota() 

    /**
     * Returns the value of field 'codMunicipio'.
     * 
     * @return long
     * @return the value of field 'codMunicipio'.
     */
    public long getCodMunicipio()
    {
        return this._codMunicipio;
    } //-- long getCodMunicipio() 

    /**
     * Returns the value of field 'codUf'.
     * 
     * @return int
     * @return the value of field 'codUf'.
     */
    public int getCodUf()
    {
        return this._codUf;
    } //-- int getCodUf() 

    /**
     * Returns the value of field 'descMunicipio'.
     * 
     * @return String
     * @return the value of field 'descMunicipio'.
     */
    public java.lang.String getDescMunicipio()
    {
        return this._descMunicipio;
    } //-- java.lang.String getDescMunicipio() 

    /**
     * Returns the value of field 'siglaUf'.
     * 
     * @return String
     * @return the value of field 'siglaUf'.
     */
    public java.lang.String getSiglaUf()
    {
        return this._siglaUf;
    } //-- java.lang.String getSiglaUf() 

    /**
     * Method hasCodMunicipio
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodMunicipio()
    {
        return this._has_codMunicipio;
    } //-- boolean hasCodMunicipio() 

    /**
     * Method hasCodUf
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodUf()
    {
        return this._has_codUf;
    } //-- boolean hasCodUf() 

    /**
     * Method isValid
     * 
     * 
     * 
     * @return boolean
     */
    public boolean isValid()
    {
        try {
            validate();
        }
        catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    } //-- boolean isValid() 

    /**
     * Method marshal
     * 
     * 
     * 
     * @param out
     */
    public void marshal(java.io.Writer out)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, out);
    } //-- void marshal(java.io.Writer) 

    /**
     * Method marshal
     * 
     * 
     * 
     * @param handler
     */
    public void marshal(org.xml.sax.ContentHandler handler)
        throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, handler);
    } //-- void marshal(org.xml.sax.ContentHandler) 

    /**
     * Sets the value of field 'aliquota'.
     * 
     * @param aliquota the value of field 'aliquota'.
     */
    public void setAliquota(java.math.BigDecimal aliquota)
    {
        this._aliquota = aliquota;
    } //-- void setAliquota(java.math.BigDecimal) 

    /**
     * Sets the value of field 'codMunicipio'.
     * 
     * @param codMunicipio the value of field 'codMunicipio'.
     */
    public void setCodMunicipio(long codMunicipio)
    {
        this._codMunicipio = codMunicipio;
        this._has_codMunicipio = true;
    } //-- void setCodMunicipio(long) 

    /**
     * Sets the value of field 'codUf'.
     * 
     * @param codUf the value of field 'codUf'.
     */
    public void setCodUf(int codUf)
    {
        this._codUf = codUf;
        this._has_codUf = true;
    } //-- void setCodUf(int) 

    /**
     * Sets the value of field 'descMunicipio'.
     * 
     * @param descMunicipio the value of field 'descMunicipio'.
     */
    public void setDescMunicipio(java.lang.String descMunicipio)
    {
        this._descMunicipio = descMunicipio;
    } //-- void setDescMunicipio(java.lang.String) 

    /**
     * Sets the value of field 'siglaUf'.
     * 
     * @param siglaUf the value of field 'siglaUf'.
     */
    public void setSiglaUf(java.lang.String siglaUf)
    {
        this._siglaUf = siglaUf;
    } //-- void setSiglaUf(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListaConsultarAliquota
     */
    public static br.com.bradesco.web.giss.service.data.pdc.consultaraliquota.response.ListaConsultarAliquota unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.consultaraliquota.response.ListaConsultarAliquota) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.consultaraliquota.response.ListaConsultarAliquota.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultaraliquota.response.ListaConsultarAliquota unmarshal(java.io.Reader) 

    /**
     * Method validate
     * 
     */
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
