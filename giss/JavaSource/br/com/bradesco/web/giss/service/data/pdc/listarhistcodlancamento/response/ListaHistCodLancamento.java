/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ListaHistCodLancamento.java,v 1.8 2018/05/17 18:47:15 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listarhistcodlancamento.response;

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
 * Class ListaHistCodLancamento.
 * 
 * @version $Revision: 1.8 $ $Date: 2018/05/17 18:47:15 $
 */
public class ListaHistCodLancamento implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codLancamento
     */
    private int _codLancamento = 0;

    /**
     * keeps track of state for field: _codLancamento
     */
    private boolean _has_codLancamento;

    /**
     * Field _codItem
     */
    private int _codItem = 0;

    /**
     * keeps track of state for field: _codItem
     */
    private boolean _has_codItem;

    /**
     * Field _dataAtualizacao
     */
    private java.lang.String _dataAtualizacao;

    /**
     * Field _horaAtualizacao
     */
    private java.lang.String _horaAtualizacao;

    /**
     * Field _dataExclusao
     */
    private java.lang.String _dataExclusao;

    /**
     * Field _codFunc
     */
    private java.lang.String _codFunc;

    /**
     * Field _paramLancamento
     */
    private int _paramLancamento = 0;

    /**
     * keeps track of state for field: _paramLancamento
     */
    private boolean _has_paramLancamento;

    /**
     * Field _hrInclusaoRegistroHist
     */
    private java.lang.String _hrInclusaoRegistroHist;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListaHistCodLancamento() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarhistcodlancamento.response.ListaHistCodLancamento()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodItem
     * 
     */
    public void deleteCodItem()
    {
        this._has_codItem= false;
    } //-- void deleteCodItem() 

    /**
     * Method deleteCodLancamento
     * 
     */
    public void deleteCodLancamento()
    {
        this._has_codLancamento= false;
    } //-- void deleteCodLancamento() 

    /**
     * Method deleteParamLancamento
     * 
     */
    public void deleteParamLancamento()
    {
        this._has_paramLancamento= false;
    } //-- void deleteParamLancamento() 

    /**
     * Returns the value of field 'codFunc'.
     * 
     * @return String
     * @return the value of field 'codFunc'.
     */
    public java.lang.String getCodFunc()
    {
        return this._codFunc;
    } //-- java.lang.String getCodFunc() 

    /**
     * Returns the value of field 'codItem'.
     * 
     * @return int
     * @return the value of field 'codItem'.
     */
    public int getCodItem()
    {
        return this._codItem;
    } //-- int getCodItem() 

    /**
     * Returns the value of field 'codLancamento'.
     * 
     * @return int
     * @return the value of field 'codLancamento'.
     */
    public int getCodLancamento()
    {
        return this._codLancamento;
    } //-- int getCodLancamento() 

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
     * Returns the value of field 'dataExclusao'.
     * 
     * @return String
     * @return the value of field 'dataExclusao'.
     */
    public java.lang.String getDataExclusao()
    {
        return this._dataExclusao;
    } //-- java.lang.String getDataExclusao() 

    /**
     * Returns the value of field 'horaAtualizacao'.
     * 
     * @return String
     * @return the value of field 'horaAtualizacao'.
     */
    public java.lang.String getHoraAtualizacao()
    {
        return this._horaAtualizacao;
    } //-- java.lang.String getHoraAtualizacao() 

    /**
     * Returns the value of field 'hrInclusaoRegistroHist'.
     * 
     * @return String
     * @return the value of field 'hrInclusaoRegistroHist'.
     */
    public java.lang.String getHrInclusaoRegistroHist()
    {
        return this._hrInclusaoRegistroHist;
    } //-- java.lang.String getHrInclusaoRegistroHist() 

    /**
     * Returns the value of field 'paramLancamento'.
     * 
     * @return int
     * @return the value of field 'paramLancamento'.
     */
    public int getParamLancamento()
    {
        return this._paramLancamento;
    } //-- int getParamLancamento() 

    /**
     * Method hasCodItem
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodItem()
    {
        return this._has_codItem;
    } //-- boolean hasCodItem() 

    /**
     * Method hasCodLancamento
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodLancamento()
    {
        return this._has_codLancamento;
    } //-- boolean hasCodLancamento() 

    /**
     * Method hasParamLancamento
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasParamLancamento()
    {
        return this._has_paramLancamento;
    } //-- boolean hasParamLancamento() 

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
     * Sets the value of field 'codFunc'.
     * 
     * @param codFunc the value of field 'codFunc'.
     */
    public void setCodFunc(java.lang.String codFunc)
    {
        this._codFunc = codFunc;
    } //-- void setCodFunc(java.lang.String) 

    /**
     * Sets the value of field 'codItem'.
     * 
     * @param codItem the value of field 'codItem'.
     */
    public void setCodItem(int codItem)
    {
        this._codItem = codItem;
        this._has_codItem = true;
    } //-- void setCodItem(int) 

    /**
     * Sets the value of field 'codLancamento'.
     * 
     * @param codLancamento the value of field 'codLancamento'.
     */
    public void setCodLancamento(int codLancamento)
    {
        this._codLancamento = codLancamento;
        this._has_codLancamento = true;
    } //-- void setCodLancamento(int) 

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
     * Sets the value of field 'dataExclusao'.
     * 
     * @param dataExclusao the value of field 'dataExclusao'.
     */
    public void setDataExclusao(java.lang.String dataExclusao)
    {
        this._dataExclusao = dataExclusao;
    } //-- void setDataExclusao(java.lang.String) 

    /**
     * Sets the value of field 'horaAtualizacao'.
     * 
     * @param horaAtualizacao the value of field 'horaAtualizacao'.
     */
    public void setHoraAtualizacao(java.lang.String horaAtualizacao)
    {
        this._horaAtualizacao = horaAtualizacao;
    } //-- void setHoraAtualizacao(java.lang.String) 

    /**
     * Sets the value of field 'hrInclusaoRegistroHist'.
     * 
     * @param hrInclusaoRegistroHist the value of field
     * 'hrInclusaoRegistroHist'.
     */
    public void setHrInclusaoRegistroHist(java.lang.String hrInclusaoRegistroHist)
    {
        this._hrInclusaoRegistroHist = hrInclusaoRegistroHist;
    } //-- void setHrInclusaoRegistroHist(java.lang.String) 

    /**
     * Sets the value of field 'paramLancamento'.
     * 
     * @param paramLancamento the value of field 'paramLancamento'.
     */
    public void setParamLancamento(int paramLancamento)
    {
        this._paramLancamento = paramLancamento;
        this._has_paramLancamento = true;
    } //-- void setParamLancamento(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListaHistCodLancamento
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarhistcodlancamento.response.ListaHistCodLancamento unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarhistcodlancamento.response.ListaHistCodLancamento) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarhistcodlancamento.response.ListaHistCodLancamento.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarhistcodlancamento.response.ListaHistCodLancamento unmarshal(java.io.Reader) 

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
