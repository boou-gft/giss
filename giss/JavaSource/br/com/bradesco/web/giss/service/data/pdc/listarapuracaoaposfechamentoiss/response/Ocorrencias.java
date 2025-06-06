/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: Ocorrencias.java,v 1.1 2017/04/11 14:09:28 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentoiss.response;

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
 * Class Ocorrencias.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/04/11 14:09:28 $
 */
public class Ocorrencias implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codigoSolicitacaoApuracao
     */
    private int _codigoSolicitacaoApuracao = 0;

    /**
     * keeps track of state for field: _codigoSolicitacaoApuracao
     */
    private boolean _has_codigoSolicitacaoApuracao;

    /**
     * Field _dataSolicitacaoApuracao
     */
    private java.lang.String _dataSolicitacaoApuracao;

    /**
     * Field _dataProcessamento
     */
    private java.lang.String _dataProcessamento;


      //----------------/
     //- Constructors -/
    //----------------/

    public Ocorrencias() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentoiss.response.Ocorrencias()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodigoSolicitacaoApuracao
     * 
     */
    public void deleteCodigoSolicitacaoApuracao()
    {
        this._has_codigoSolicitacaoApuracao= false;
    } //-- void deleteCodigoSolicitacaoApuracao() 

    /**
     * Returns the value of field 'codigoSolicitacaoApuracao'.
     * 
     * @return int
     * @return the value of field 'codigoSolicitacaoApuracao'.
     */
    public int getCodigoSolicitacaoApuracao()
    {
        return this._codigoSolicitacaoApuracao;
    } //-- int getCodigoSolicitacaoApuracao() 

    /**
     * Returns the value of field 'dataProcessamento'.
     * 
     * @return String
     * @return the value of field 'dataProcessamento'.
     */
    public java.lang.String getDataProcessamento()
    {
        return this._dataProcessamento;
    } //-- java.lang.String getDataProcessamento() 

    /**
     * Returns the value of field 'dataSolicitacaoApuracao'.
     * 
     * @return String
     * @return the value of field 'dataSolicitacaoApuracao'.
     */
    public java.lang.String getDataSolicitacaoApuracao()
    {
        return this._dataSolicitacaoApuracao;
    } //-- java.lang.String getDataSolicitacaoApuracao() 

    /**
     * Method hasCodigoSolicitacaoApuracao
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoSolicitacaoApuracao()
    {
        return this._has_codigoSolicitacaoApuracao;
    } //-- boolean hasCodigoSolicitacaoApuracao() 

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
     * Sets the value of field 'codigoSolicitacaoApuracao'.
     * 
     * @param codigoSolicitacaoApuracao the value of field
     * 'codigoSolicitacaoApuracao'.
     */
    public void setCodigoSolicitacaoApuracao(int codigoSolicitacaoApuracao)
    {
        this._codigoSolicitacaoApuracao = codigoSolicitacaoApuracao;
        this._has_codigoSolicitacaoApuracao = true;
    } //-- void setCodigoSolicitacaoApuracao(int) 

    /**
     * Sets the value of field 'dataProcessamento'.
     * 
     * @param dataProcessamento the value of field
     * 'dataProcessamento'.
     */
    public void setDataProcessamento(java.lang.String dataProcessamento)
    {
        this._dataProcessamento = dataProcessamento;
    } //-- void setDataProcessamento(java.lang.String) 

    /**
     * Sets the value of field 'dataSolicitacaoApuracao'.
     * 
     * @param dataSolicitacaoApuracao the value of field
     * 'dataSolicitacaoApuracao'.
     */
    public void setDataSolicitacaoApuracao(java.lang.String dataSolicitacaoApuracao)
    {
        this._dataSolicitacaoApuracao = dataSolicitacaoApuracao;
    } //-- void setDataSolicitacaoApuracao(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return Ocorrencias
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentoiss.response.Ocorrencias unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentoiss.response.Ocorrencias) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentoiss.response.Ocorrencias.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentoiss.response.Ocorrencias unmarshal(java.io.Reader) 

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
