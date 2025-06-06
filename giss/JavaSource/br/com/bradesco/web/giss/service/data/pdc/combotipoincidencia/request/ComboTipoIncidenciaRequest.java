/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ComboTipoIncidenciaRequest.java,v 1.1 2017/04/11 14:10:07 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.combotipoincidencia.request;

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
 * Class ComboTipoIncidenciaRequest.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/04/11 14:10:07 $
 */
public class ComboTipoIncidenciaRequest implements java.io.Serializable {


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
     * Field _codigoTipoIncidencia
     */
    private int _codigoTipoIncidencia = 0;

    /**
     * keeps track of state for field: _codigoTipoIncidencia
     */
    private boolean _has_codigoTipoIncidencia;


      //----------------/
     //- Constructors -/
    //----------------/

    public ComboTipoIncidenciaRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.combotipoincidencia.request.ComboTipoIncidenciaRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodigoTipoIncidencia
     * 
     */
    public void deleteCodigoTipoIncidencia()
    {
        this._has_codigoTipoIncidencia= false;
    } //-- void deleteCodigoTipoIncidencia() 

    /**
     * Method deleteQuantidadeOcorrencias
     * 
     */
    public void deleteQuantidadeOcorrencias()
    {
        this._has_quantidadeOcorrencias= false;
    } //-- void deleteQuantidadeOcorrencias() 

    /**
     * Returns the value of field 'codigoTipoIncidencia'.
     * 
     * @return int
     * @return the value of field 'codigoTipoIncidencia'.
     */
    public int getCodigoTipoIncidencia()
    {
        return this._codigoTipoIncidencia;
    } //-- int getCodigoTipoIncidencia() 

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
     * Method hasCodigoTipoIncidencia
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoTipoIncidencia()
    {
        return this._has_codigoTipoIncidencia;
    } //-- boolean hasCodigoTipoIncidencia() 

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
     * Sets the value of field 'codigoTipoIncidencia'.
     * 
     * @param codigoTipoIncidencia the value of field
     * 'codigoTipoIncidencia'.
     */
    public void setCodigoTipoIncidencia(int codigoTipoIncidencia)
    {
        this._codigoTipoIncidencia = codigoTipoIncidencia;
        this._has_codigoTipoIncidencia = true;
    } //-- void setCodigoTipoIncidencia(int) 

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
     * @return ComboTipoIncidenciaRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.combotipoincidencia.request.ComboTipoIncidenciaRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.combotipoincidencia.request.ComboTipoIncidenciaRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.combotipoincidencia.request.ComboTipoIncidenciaRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.combotipoincidencia.request.ComboTipoIncidenciaRequest unmarshal(java.io.Reader) 

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
