/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.consultarinformacoesaliquota.request;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * Class ConsultarInformacoesAliquotaRequest.
 * 
 * @version $Revision$ $Date$
 */
public class ConsultarInformacoesAliquotaRequest implements java.io.Serializable {


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
     * Field _codItemLeiCompl
     */
    private int _codItemLeiCompl = 0;

    /**
     * keeps track of state for field: _codItemLeiCompl
     */
    private boolean _has_codItemLeiCompl;

    /**
     * Field _dtInicioVigencia
     */
    private int _dtInicioVigencia = 0;

    /**
     * keeps track of state for field: _dtInicioVigencia
     */
    private boolean _has_dtInicioVigencia;

    /**
     * Field _dtFimVigencia
     */
    private int _dtFimVigencia = 0;

    /**
     * keeps track of state for field: _dtFimVigencia
     */
    private boolean _has_dtFimVigencia;


      //----------------/
     //- Constructors -/
    //----------------/

    public ConsultarInformacoesAliquotaRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultarinformacoesaliquota.request.ConsultarInformacoesAliquotaRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodItemLeiCompl
     * 
     */
    public void deleteCodItemLeiCompl()
    {
        this._has_codItemLeiCompl= false;
    } //-- void deleteCodItemLeiCompl() 

    /**
     * Method deleteCodMunicipio
     * 
     */
    public void deleteCodMunicipio()
    {
        this._has_codMunicipio= false;
    } //-- void deleteCodMunicipio() 

    /**
     * Method deleteDtFimVigencia
     * 
     */
    public void deleteDtFimVigencia()
    {
        this._has_dtFimVigencia= false;
    } //-- void deleteDtFimVigencia() 

    /**
     * Method deleteDtInicioVigencia
     * 
     */
    public void deleteDtInicioVigencia()
    {
        this._has_dtInicioVigencia= false;
    } //-- void deleteDtInicioVigencia() 

    /**
     * Returns the value of field 'codItemLeiCompl'.
     * 
     * @return int
     * @return the value of field 'codItemLeiCompl'.
     */
    public int getCodItemLeiCompl()
    {
        return this._codItemLeiCompl;
    } //-- int getCodItemLeiCompl() 

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
     * Returns the value of field 'dtFimVigencia'.
     * 
     * @return int
     * @return the value of field 'dtFimVigencia'.
     */
    public int getDtFimVigencia()
    {
        return this._dtFimVigencia;
    } //-- int getDtFimVigencia() 

    /**
     * Returns the value of field 'dtInicioVigencia'.
     * 
     * @return int
     * @return the value of field 'dtInicioVigencia'.
     */
    public int getDtInicioVigencia()
    {
        return this._dtInicioVigencia;
    } //-- int getDtInicioVigencia() 

    /**
     * Method hasCodItemLeiCompl
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodItemLeiCompl()
    {
        return this._has_codItemLeiCompl;
    } //-- boolean hasCodItemLeiCompl() 

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
     * Method hasDtFimVigencia
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasDtFimVigencia()
    {
        return this._has_dtFimVigencia;
    } //-- boolean hasDtFimVigencia() 

    /**
     * Method hasDtInicioVigencia
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasDtInicioVigencia()
    {
        return this._has_dtInicioVigencia;
    } //-- boolean hasDtInicioVigencia() 

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
     * Sets the value of field 'codItemLeiCompl'.
     * 
     * @param codItemLeiCompl the value of field 'codItemLeiCompl'.
     */
    public void setCodItemLeiCompl(int codItemLeiCompl)
    {
        this._codItemLeiCompl = codItemLeiCompl;
        this._has_codItemLeiCompl = true;
    } //-- void setCodItemLeiCompl(int) 

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
     * Sets the value of field 'dtFimVigencia'.
     * 
     * @param dtFimVigencia the value of field 'dtFimVigencia'.
     */
    public void setDtFimVigencia(int dtFimVigencia)
    {
        this._dtFimVigencia = dtFimVigencia;
        this._has_dtFimVigencia = true;
    } //-- void setDtFimVigencia(int) 

    /**
     * Sets the value of field 'dtInicioVigencia'.
     * 
     * @param dtInicioVigencia the value of field 'dtInicioVigencia'
     */
    public void setDtInicioVigencia(int dtInicioVigencia)
    {
        this._dtInicioVigencia = dtInicioVigencia;
        this._has_dtInicioVigencia = true;
    } //-- void setDtInicioVigencia(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ConsultarInformacoesAliquotaRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.consultarinformacoesaliquota.request.ConsultarInformacoesAliquotaRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.consultarinformacoesaliquota.request.ConsultarInformacoesAliquotaRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.consultarinformacoesaliquota.request.ConsultarInformacoesAliquotaRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultarinformacoesaliquota.request.ConsultarInformacoesAliquotaRequest unmarshal(java.io.Reader) 

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
