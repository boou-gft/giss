/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: Ocorrencias.java,v 1.1 2017/04/11 14:11:15 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensalreprocessamento.response;

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
 * @version $Revision: 1.1 $ $Date: 2017/04/11 14:11:15 $
 */
public class Ocorrencias implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codigo
     */
    private int _codigo = 0;

    /**
     * keeps track of state for field: _codigo
     */
    private boolean _has_codigo;

    /**
     * Field _solicitacao
     */
    private java.lang.String _solicitacao;

    /**
     * Field _processamento
     */
    private java.lang.String _processamento;

    /**
     * Field _periodoInicial
     */
    private java.lang.String _periodoInicial;

    /**
     * Field _periodoFinal
     */
    private java.lang.String _periodoFinal;


      //----------------/
     //- Constructors -/
    //----------------/

    public Ocorrencias() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensalreprocessamento.response.Ocorrencias()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodigo
     * 
     */
    public void deleteCodigo()
    {
        this._has_codigo= false;
    } //-- void deleteCodigo() 

    /**
     * Returns the value of field 'codigo'.
     * 
     * @return int
     * @return the value of field 'codigo'.
     */
    public int getCodigo()
    {
        return this._codigo;
    } //-- int getCodigo() 

    /**
     * Returns the value of field 'periodoFinal'.
     * 
     * @return String
     * @return the value of field 'periodoFinal'.
     */
    public java.lang.String getPeriodoFinal()
    {
        return this._periodoFinal;
    } //-- java.lang.String getPeriodoFinal() 

    /**
     * Returns the value of field 'periodoInicial'.
     * 
     * @return String
     * @return the value of field 'periodoInicial'.
     */
    public java.lang.String getPeriodoInicial()
    {
        return this._periodoInicial;
    } //-- java.lang.String getPeriodoInicial() 

    /**
     * Returns the value of field 'processamento'.
     * 
     * @return String
     * @return the value of field 'processamento'.
     */
    public java.lang.String getProcessamento()
    {
        return this._processamento;
    } //-- java.lang.String getProcessamento() 

    /**
     * Returns the value of field 'solicitacao'.
     * 
     * @return String
     * @return the value of field 'solicitacao'.
     */
    public java.lang.String getSolicitacao()
    {
        return this._solicitacao;
    } //-- java.lang.String getSolicitacao() 

    /**
     * Method hasCodigo
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigo()
    {
        return this._has_codigo;
    } //-- boolean hasCodigo() 

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
     * Sets the value of field 'codigo'.
     * 
     * @param codigo the value of field 'codigo'.
     */
    public void setCodigo(int codigo)
    {
        this._codigo = codigo;
        this._has_codigo = true;
    } //-- void setCodigo(int) 

    /**
     * Sets the value of field 'periodoFinal'.
     * 
     * @param periodoFinal the value of field 'periodoFinal'.
     */
    public void setPeriodoFinal(java.lang.String periodoFinal)
    {
        this._periodoFinal = periodoFinal;
    } //-- void setPeriodoFinal(java.lang.String) 

    /**
     * Sets the value of field 'periodoInicial'.
     * 
     * @param periodoInicial the value of field 'periodoInicial'.
     */
    public void setPeriodoInicial(java.lang.String periodoInicial)
    {
        this._periodoInicial = periodoInicial;
    } //-- void setPeriodoInicial(java.lang.String) 

    /**
     * Sets the value of field 'processamento'.
     * 
     * @param processamento the value of field 'processamento'.
     */
    public void setProcessamento(java.lang.String processamento)
    {
        this._processamento = processamento;
    } //-- void setProcessamento(java.lang.String) 

    /**
     * Sets the value of field 'solicitacao'.
     * 
     * @param solicitacao the value of field 'solicitacao'.
     */
    public void setSolicitacao(java.lang.String solicitacao)
    {
        this._solicitacao = solicitacao;
    } //-- void setSolicitacao(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return Ocorrencias
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensalreprocessamento.response.Ocorrencias unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensalreprocessamento.response.Ocorrencias) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensalreprocessamento.response.Ocorrencias.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensalreprocessamento.response.Ocorrencias unmarshal(java.io.Reader) 

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
