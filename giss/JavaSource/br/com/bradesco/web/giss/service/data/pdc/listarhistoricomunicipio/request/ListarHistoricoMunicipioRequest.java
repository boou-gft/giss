/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.listarhistoricomunicipio.request;

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
 * Class ListarHistoricoMunicipioRequest.
 * 
 * @version $Revision$ $Date$
 */
public class ListarHistoricoMunicipioRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _qtdOcorrencia
     */
    private int _qtdOcorrencia = 0;

    /**
     * keeps track of state for field: _qtdOcorrencia
     */
    private boolean _has_qtdOcorrencia;

    /**
     * Field _codigoUf
     */
    private int _codigoUf = 0;

    /**
     * keeps track of state for field: _codigoUf
     */
    private boolean _has_codigoUf;

    /**
     * Field _codigoMunicipio
     */
    private long _codigoMunicipio = 0;

    /**
     * keeps track of state for field: _codigoMunicipio
     */
    private boolean _has_codigoMunicipio;

    /**
     * Field _dataAtualizacao
     */
    private java.lang.String _dataAtualizacao;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarHistoricoMunicipioRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarhistoricomunicipio.request.ListarHistoricoMunicipioRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodigoMunicipio
     * 
     */
    public void deleteCodigoMunicipio()
    {
        this._has_codigoMunicipio= false;
    } //-- void deleteCodigoMunicipio() 

    /**
     * Method deleteCodigoUf
     * 
     */
    public void deleteCodigoUf()
    {
        this._has_codigoUf= false;
    } //-- void deleteCodigoUf() 

    /**
     * Method deleteQtdOcorrencia
     * 
     */
    public void deleteQtdOcorrencia()
    {
        this._has_qtdOcorrencia= false;
    } //-- void deleteQtdOcorrencia() 

    /**
     * Returns the value of field 'codigoMunicipio'.
     * 
     * @return long
     * @return the value of field 'codigoMunicipio'.
     */
    public long getCodigoMunicipio()
    {
        return this._codigoMunicipio;
    } //-- long getCodigoMunicipio() 

    /**
     * Returns the value of field 'codigoUf'.
     * 
     * @return int
     * @return the value of field 'codigoUf'.
     */
    public int getCodigoUf()
    {
        return this._codigoUf;
    } //-- int getCodigoUf() 

    /**
     * Returns the value of field 'dataAtualizacao'.
     * 
     * @return String
     * @return the value of field 'dataAtualizacao'.
     */
    public java.lang.String getDataAtualizacao()
    {
        return this._dataAtualizacao;
    } //-- java.lang.String getDataAtualizacao() 

    /**
     * Returns the value of field 'qtdOcorrencia'.
     * 
     * @return int
     * @return the value of field 'qtdOcorrencia'.
     */
    public int getQtdOcorrencia()
    {
        return this._qtdOcorrencia;
    } //-- int getQtdOcorrencia() 

    /**
     * Method hasCodigoMunicipio
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoMunicipio()
    {
        return this._has_codigoMunicipio;
    } //-- boolean hasCodigoMunicipio() 

    /**
     * Method hasCodigoUf
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoUf()
    {
        return this._has_codigoUf;
    } //-- boolean hasCodigoUf() 

    /**
     * Method hasQtdOcorrencia
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasQtdOcorrencia()
    {
        return this._has_qtdOcorrencia;
    } //-- boolean hasQtdOcorrencia() 

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
     * Sets the value of field 'codigoMunicipio'.
     * 
     * @param codigoMunicipio the value of field 'codigoMunicipio'.
     */
    public void setCodigoMunicipio(long codigoMunicipio)
    {
        this._codigoMunicipio = codigoMunicipio;
        this._has_codigoMunicipio = true;
    } //-- void setCodigoMunicipio(long) 

    /**
     * Sets the value of field 'codigoUf'.
     * 
     * @param codigoUf the value of field 'codigoUf'.
     */
    public void setCodigoUf(int codigoUf)
    {
        this._codigoUf = codigoUf;
        this._has_codigoUf = true;
    } //-- void setCodigoUf(int) 

    /**
     * Sets the value of field 'dataAtualizacao'.
     * 
     * @param dataAtualizacao the value of field 'dataAtualizacao'.
     */
    public void setDataAtualizacao(java.lang.String dataAtualizacao)
    {
        this._dataAtualizacao = dataAtualizacao;
    } //-- void setDataAtualizacao(java.lang.String) 

    /**
     * Sets the value of field 'qtdOcorrencia'.
     * 
     * @param qtdOcorrencia the value of field 'qtdOcorrencia'.
     */
    public void setQtdOcorrencia(int qtdOcorrencia)
    {
        this._qtdOcorrencia = qtdOcorrencia;
        this._has_qtdOcorrencia = true;
    } //-- void setQtdOcorrencia(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListarHistoricoMunicipioRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarhistoricomunicipio.request.ListarHistoricoMunicipioRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarhistoricomunicipio.request.ListarHistoricoMunicipioRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarhistoricomunicipio.request.ListarHistoricoMunicipioRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarhistoricomunicipio.request.ListarHistoricoMunicipioRequest unmarshal(java.io.Reader) 

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
