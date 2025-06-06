/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.parametrizacaodepconsultar.response;

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
 * Class ParametrizacaoDepConsultarResponse.
 * 
 * @version $Revision$ $Date$
 */
public class ParametrizacaoDepConsultarResponse implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codMensagem
     */
    private java.lang.String _codMensagem;

    /**
     * Field _mensagem
     */
    private java.lang.String _mensagem;

    /**
     * Field _sCchaveSegrcPreft
     */
    private java.lang.String _sCchaveSegrcPreft;

    /**
     * Field _GISSW04SEURLPREFTMUN
     */
    private java.lang.String _GISSW04SEURLPREFTMUN;


      //----------------/
     //- Constructors -/
    //----------------/

    public ParametrizacaoDepConsultarResponse() 
     {
        super();
    } //-- br.com.bradesco.web.service.data.pdc.parametrizacaodepconsultar.response.ParametrizacaoDepConsultarResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'codMensagem'.
     * 
     * @return String
     * @return the value of field 'codMensagem'.
     */
    public java.lang.String getCodMensagem()
    {
        return this._codMensagem;
    } //-- java.lang.String getCodMensagem() 

    /**
     * Returns the value of field 'GISSW04SEURLPREFTMUN'.
     * 
     * @return String
     * @return the value of field 'GISSW04SEURLPREFTMUN'.
     */
    public java.lang.String getGISSW04SEURLPREFTMUN()
    {
    	return this._GISSW04SEURLPREFTMUN;
    } //-- java.lang.String getGISSW04SEURLPREFTMUN() 

    /**
     * Returns the value of field 'mensagem'.
     * 
     * @return String
     * @return the value of field 'mensagem'.
     */
    public java.lang.String getMensagem()
    {
        return this._mensagem;
    } //-- java.lang.String getMensagem() 

    /**
     * Returns the value of field 'sCchaveSegrcPreft'.
     * 
     * @return String
     * @return the value of field 'sCchaveSegrcPreft'.
     */
    public java.lang.String getSCchaveSegrcPreft()
    {
        return this._sCchaveSegrcPreft;
    } //-- java.lang.String getSCchaveSegrcPreft() 

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
     * Sets the value of field 'codMensagem'.
     * 
     * @param codMensagem the value of field 'codMensagem'.
     */
    public void setCodMensagem(java.lang.String codMensagem)
    {
        this._codMensagem = codMensagem;
    } //-- void setCodMensagem(java.lang.String) 

    /**
     * Sets the value of field 'GISSW04SEURLPREFTMUN'.
     * 
     * @param GISSW04SEURLPREFTMUN the value of field
     * 'GISSW04SEURLPREFTMUN'.
     */
    public void setGISSW04SEURLPREFTMUN(java.lang.String GISSW04SEURLPREFTMUN)
    {
        this._GISSW04SEURLPREFTMUN = GISSW04SEURLPREFTMUN;
    } //-- void setGISSW04SEURLPREFTMUN(java.lang.String) 

    /**
     * Sets the value of field 'mensagem'.
     * 
     * @param mensagem the value of field 'mensagem'.
     */
    public void setMensagem(java.lang.String mensagem)
    {
        this._mensagem = mensagem;
    } //-- void setMensagem(java.lang.String) 

    /**
     * Sets the value of field 'sCchaveSegrcPreft'.
     * 
     * @param sCchaveSegrcPreft the value of field
     * 'sCchaveSegrcPreft'.
     */
    public void setSCchaveSegrcPreft(java.lang.String sCchaveSegrcPreft)
    {
        this._sCchaveSegrcPreft = sCchaveSegrcPreft;
    } //-- void setSCchaveSegrcPreft(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ParametrizacaoDepConsultarResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.parametrizacaodepconsultar.response.ParametrizacaoDepConsultarResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.parametrizacaodepconsultar.response.ParametrizacaoDepConsultarResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.parametrizacaodepconsultar.response.ParametrizacaoDepConsultarResponse.class, reader);
    } //-- br.com.bradesco.web.service.data.pdc.parametrizacaodepconsultar.response.ParametrizacaoDepConsultarResponse unmarshal(java.io.Reader) 

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
