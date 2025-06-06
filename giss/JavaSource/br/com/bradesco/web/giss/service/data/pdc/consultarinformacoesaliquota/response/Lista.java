/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.consultarinformacoesaliquota.response;

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
 * Class Lista.
 * 
 * @version $Revision$ $Date$
 */
public class Lista implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codItemCompl
     */
    private int _codItemCompl = 0;

    /**
     * keeps track of state for field: _codItemCompl
     */
    private boolean _has_codItemCompl;

    /**
     * Field _descItemCompl
     */
    private java.lang.String _descItemCompl;

    /**
     * Field _aliquota
     */
    private java.math.BigDecimal _aliquota = new java.math.BigDecimal("0");

    /**
     * Field _dtInicioVigencia
     */
    private java.lang.String _dtInicioVigencia;

    /**
     * Field _dtFimVigencia
     */
    private java.lang.String _dtFimVigencia;


      //----------------/
     //- Constructors -/
    //----------------/

    public Lista() 
     {
        super();
        setAliquota(new java.math.BigDecimal("0"));
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultarinformacoesaliquota.response.Lista()


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
     * Returns the value of field 'dtFimVigencia'.
     * 
     * @return String
     * @return the value of field 'dtFimVigencia'.
     */
    public java.lang.String getDtFimVigencia()
    {
        return this._dtFimVigencia;
    } //-- java.lang.String getDtFimVigencia() 

    /**
     * Returns the value of field 'dtInicioVigencia'.
     * 
     * @return String
     * @return the value of field 'dtInicioVigencia'.
     */
    public java.lang.String getDtInicioVigencia()
    {
        return this._dtInicioVigencia;
    } //-- java.lang.String getDtInicioVigencia() 

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
     * Sets the value of field 'descItemCompl'.
     * 
     * @param descItemCompl the value of field 'descItemCompl'.
     */
    public void setDescItemCompl(java.lang.String descItemCompl)
    {
        this._descItemCompl = descItemCompl;
    } //-- void setDescItemCompl(java.lang.String) 

    /**
     * Sets the value of field 'dtFimVigencia'.
     * 
     * @param dtFimVigencia the value of field 'dtFimVigencia'.
     */
    public void setDtFimVigencia(java.lang.String dtFimVigencia)
    {
        this._dtFimVigencia = dtFimVigencia;
    } //-- void setDtFimVigencia(java.lang.String) 

    /**
     * Sets the value of field 'dtInicioVigencia'.
     * 
     * @param dtInicioVigencia the value of field 'dtInicioVigencia'
     */
    public void setDtInicioVigencia(java.lang.String dtInicioVigencia)
    {
        this._dtInicioVigencia = dtInicioVigencia;
    } //-- void setDtInicioVigencia(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return Lista
     */
    public static br.com.bradesco.web.giss.service.data.pdc.consultarinformacoesaliquota.response.Lista unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.consultarinformacoesaliquota.response.Lista) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.consultarinformacoesaliquota.response.Lista.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultarinformacoesaliquota.response.Lista unmarshal(java.io.Reader) 

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
