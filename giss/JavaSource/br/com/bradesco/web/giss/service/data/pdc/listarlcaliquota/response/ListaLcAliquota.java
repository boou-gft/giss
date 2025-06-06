/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ListaLcAliquota.java,v 1.3 2017/12/08 17:29:25 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listarlcaliquota.response;

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
 * Class ListaLcAliquota.
 * 
 * @version $Revision: 1.3 $ $Date: 2017/12/08 17:29:25 $
 */
public class ListaLcAliquota implements java.io.Serializable {


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
     * Field _codItemCompl
     */
    private int _codItemCompl = 0;

    /**
     * keeps track of state for field: _codItemCompl
     */
    private boolean _has_codItemCompl;

    /**
     * Field _dataInicioVigencia
     */
    private java.lang.String _dataInicioVigencia;

    /**
     * Field _descItemCompl
     */
    private java.lang.String _descItemCompl;

    /**
     * Field _aliquota
     */
    private java.math.BigDecimal _aliquota = new java.math.BigDecimal("0");


      //----------------/
     //- Constructors -/
    //----------------/

    public ListaLcAliquota() 
     {
        super();
        setAliquota(new java.math.BigDecimal("0"));
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarlcaliquota.response.ListaLcAliquota()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodItemCompl
     * 
     */
    public void deleteCodItemCompl()
    {
        this._has_codItemCompl= false;
    } //-- void deleteCodItemCompl() 

    /**
     * Method deleteCodMunicipio
     * 
     */
    public void deleteCodMunicipio()
    {
        this._has_codMunicipio= false;
    } //-- void deleteCodMunicipio() 

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
     * Returns the value of field 'codItemCompl'.
     * 
     * @return int
     * @return the value of field 'codItemCompl'.
     */
    public int getCodItemCompl()
    {
        return this._codItemCompl;
    } //-- int getCodItemCompl() 

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
     * Returns the value of field 'dataInicioVigencia'.
     * 
     * @return String
     * @return the value of field 'dataInicioVigencia'.
     */
    public java.lang.String getDataInicioVigencia()
    {
        return this._dataInicioVigencia;
    } //-- java.lang.String getDataInicioVigencia() 

    /**
     * Returns the value of field 'descItemCompl'.
     * 
     * @return String
     * @return the value of field 'descItemCompl'.
     */
    public java.lang.String getDescItemCompl()
    {
        return this._descItemCompl;
    } //-- java.lang.String getDescItemCompl() 

    /**
     * Method hasCodItemCompl
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodItemCompl()
    {
        return this._has_codItemCompl;
    } //-- boolean hasCodItemCompl() 

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
     * Sets the value of field 'codItemCompl'.
     * 
     * @param codItemCompl the value of field 'codItemCompl'.
     */
    public void setCodItemCompl(int codItemCompl)
    {
        this._codItemCompl = codItemCompl;
        this._has_codItemCompl = true;
    } //-- void setCodItemCompl(int) 

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
     * Sets the value of field 'dataInicioVigencia'.
     * 
     * @param dataInicioVigencia the value of field
     * 'dataInicioVigencia'.
     */
    public void setDataInicioVigencia(java.lang.String dataInicioVigencia)
    {
        this._dataInicioVigencia = dataInicioVigencia;
    } //-- void setDataInicioVigencia(java.lang.String) 

    /**
     * Sets the value of field 'descItemCompl'.
     * 
     * @param descItemCompl the value of field 'descItemCompl'.
     */
    public void setDescItemCompl(java.lang.String descItemCompl)
    {
        this._descItemCompl = descItemCompl;
    } //-- void setDescItemCompl(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListaLcAliquota
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarlcaliquota.response.ListaLcAliquota unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarlcaliquota.response.ListaLcAliquota) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarlcaliquota.response.ListaLcAliquota.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarlcaliquota.response.ListaLcAliquota unmarshal(java.io.Reader) 

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
