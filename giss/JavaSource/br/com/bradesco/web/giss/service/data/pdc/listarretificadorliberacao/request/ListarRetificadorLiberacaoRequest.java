/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.listarretificadorliberacao.request;

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
 * Class ListarRetificadorLiberacaoRequest.
 * 
 * @version $Revision$ $Date$
 */
public class ListarRetificadorLiberacaoRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _maximoOcorrencias
     */
    private int _maximoOcorrencias = 0;

    /**
     * keeps track of state for field: _maximoOcorrencias
     */
    private boolean _has_maximoOcorrencias;

    /**
     * Field _anoMesCompetencia
     */
    private int _anoMesCompetencia = 0;

    /**
     * keeps track of state for field: _anoMesCompetencia
     */
    private boolean _has_anoMesCompetencia;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarRetificadorLiberacaoRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarretificadorliberacao.request.ListarRetificadorLiberacaoRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteAnoMesCompetencia
     * 
     */
    public void deleteAnoMesCompetencia()
    {
        this._has_anoMesCompetencia= false;
    } //-- void deleteAnoMesCompetencia() 

    /**
     * Method deleteMaximoOcorrencias
     * 
     */
    public void deleteMaximoOcorrencias()
    {
        this._has_maximoOcorrencias= false;
    } //-- void deleteMaximoOcorrencias() 

    /**
     * Returns the value of field 'anoMesCompetencia'.
     * 
     * @return int
     * @return the value of field 'anoMesCompetencia'.
     */
    public int getAnoMesCompetencia()
    {
        return this._anoMesCompetencia;
    } //-- int getAnoMesCompetencia() 

    /**
     * Returns the value of field 'maximoOcorrencias'.
     * 
     * @return int
     * @return the value of field 'maximoOcorrencias'.
     */
    public int getMaximoOcorrencias()
    {
        return this._maximoOcorrencias;
    } //-- int getMaximoOcorrencias() 

    /**
     * Method hasAnoMesCompetencia
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasAnoMesCompetencia()
    {
        return this._has_anoMesCompetencia;
    } //-- boolean hasAnoMesCompetencia() 

    /**
     * Method hasMaximoOcorrencias
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasMaximoOcorrencias()
    {
        return this._has_maximoOcorrencias;
    } //-- boolean hasMaximoOcorrencias() 

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
     * Sets the value of field 'anoMesCompetencia'.
     * 
     * @param anoMesCompetencia the value of field
     * 'anoMesCompetencia'.
     */
    public void setAnoMesCompetencia(int anoMesCompetencia)
    {
        this._anoMesCompetencia = anoMesCompetencia;
        this._has_anoMesCompetencia = true;
    } //-- void setAnoMesCompetencia(int) 

    /**
     * Sets the value of field 'maximoOcorrencias'.
     * 
     * @param maximoOcorrencias the value of field
     * 'maximoOcorrencias'.
     */
    public void setMaximoOcorrencias(int maximoOcorrencias)
    {
        this._maximoOcorrencias = maximoOcorrencias;
        this._has_maximoOcorrencias = true;
    } //-- void setMaximoOcorrencias(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListarRetificadorLiberacaoRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarretificadorliberacao.request.ListarRetificadorLiberacaoRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarretificadorliberacao.request.ListarRetificadorLiberacaoRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarretificadorliberacao.request.ListarRetificadorLiberacaoRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarretificadorliberacao.request.ListarRetificadorLiberacaoRequest unmarshal(java.io.Reader) 

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
