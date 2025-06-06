/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ConsultarDependenciasEncerradasRequest.java,v 1.2 2017/08/11 16:05:00 gilbertocopoli Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.consultardependenciasencerradas.request;

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
 * Class ConsultarDependenciasEncerradasRequest.
 * 
 * @version $Revision: 1.2 $ $Date: 2017/08/11 16:05:00 $
 */
public class ConsultarDependenciasEncerradasRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _quantidadeOcorrencias
     */
    private int _quantidadeOcorrencias = 0;

    /**
     * keeps track of state for field: _quantidadeOcorrencias
     */
    private boolean _has_quantidadeOcorrencias;

    /**
     * Field _dtInicio
     */
    private java.lang.String _dtInicio;

    /**
     * Field _dtFinal
     */
    private java.lang.String _dtFinal;


      //----------------/
     //- Constructors -/
    //----------------/

    public ConsultarDependenciasEncerradasRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultardependenciasencerradas.request.ConsultarDependenciasEncerradasRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteQuantidadeOcorrencias
     * 
     */
    public void deleteQuantidadeOcorrencias()
    {
        this._has_quantidadeOcorrencias= false;
    } //-- void deleteQuantidadeOcorrencias() 

    /**
     * Returns the value of field 'dtFinal'.
     * 
     * @return String
     * @return the value of field 'dtFinal'.
     */
    public java.lang.String getDtFinal()
    {
        return this._dtFinal;
    } //-- java.lang.String getDtFinal() 

    /**
     * Returns the value of field 'dtInicio'.
     * 
     * @return String
     * @return the value of field 'dtInicio'.
     */
    public java.lang.String getDtInicio()
    {
        return this._dtInicio;
    } //-- java.lang.String getDtInicio() 

    /**
     * Returns the value of field 'quantidadeOcorrencias'.
     * 
     * @return int
     * @return the value of field 'quantidadeOcorrencias'.
     */
    public int getQuantidadeOcorrencias()
    {
        return this._quantidadeOcorrencias;
    } //-- int getQuantidadeOcorrencias() 

    /**
     * Method hasQuantidadeOcorrencias
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasQuantidadeOcorrencias()
    {
        return this._has_quantidadeOcorrencias;
    } //-- boolean hasQuantidadeOcorrencias() 

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
     * Sets the value of field 'dtFinal'.
     * 
     * @param dtFinal the value of field 'dtFinal'.
     */
    public void setDtFinal(java.lang.String dtFinal)
    {
        this._dtFinal = dtFinal;
    } //-- void setDtFinal(java.lang.String) 

    /**
     * Sets the value of field 'dtInicio'.
     * 
     * @param dtInicio the value of field 'dtInicio'.
     */
    public void setDtInicio(java.lang.String dtInicio)
    {
        this._dtInicio = dtInicio;
    } //-- void setDtInicio(java.lang.String) 

    /**
     * Sets the value of field 'quantidadeOcorrencias'.
     * 
     * @param quantidadeOcorrencias the value of field
     * 'quantidadeOcorrencias'.
     */
    public void setQuantidadeOcorrencias(int quantidadeOcorrencias)
    {
        this._quantidadeOcorrencias = quantidadeOcorrencias;
        this._has_quantidadeOcorrencias = true;
    } //-- void setQuantidadeOcorrencias(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ConsultarDependenciasEncerradasRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.consultardependenciasencerradas.request.ConsultarDependenciasEncerradasRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.consultardependenciasencerradas.request.ConsultarDependenciasEncerradasRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.consultardependenciasencerradas.request.ConsultarDependenciasEncerradasRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultardependenciasencerradas.request.ConsultarDependenciasEncerradasRequest unmarshal(java.io.Reader) 

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
