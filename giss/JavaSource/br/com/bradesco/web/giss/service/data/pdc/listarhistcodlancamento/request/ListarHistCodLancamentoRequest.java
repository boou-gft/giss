/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ListarHistCodLancamentoRequest.java,v 1.8 2018/05/17 18:47:16 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listarhistcodlancamento.request;

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
 * Class ListarHistCodLancamentoRequest.
 * 
 * @version $Revision: 1.8 $ $Date: 2018/05/17 18:47:16 $
 */
public class ListarHistCodLancamentoRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _dataInicial
     */
    private java.lang.String _dataInicial;

    /**
     * Field _dataFinal
     */
    private java.lang.String _dataFinal;

    /**
     * Field _codLancamento
     */
    private int _codLancamento = 0;

    /**
     * keeps track of state for field: _codLancamento
     */
    private boolean _has_codLancamento;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarHistCodLancamentoRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarhistcodlancamento.request.ListarHistCodLancamentoRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodLancamento
     * 
     */
    public void deleteCodLancamento()
    {
        this._has_codLancamento= false;
    } //-- void deleteCodLancamento() 

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
     * Returns the value of field 'dataFinal'.
     * 
     * @return String
     * @return the value of field 'dataFinal'.
     */
    public java.lang.String getDataFinal()
    {
        return this._dataFinal;
    } //-- java.lang.String getDataFinal() 

    /**
     * Returns the value of field 'dataInicial'.
     * 
     * @return String
     * @return the value of field 'dataInicial'.
     */
    public java.lang.String getDataInicial()
    {
        return this._dataInicial;
    } //-- java.lang.String getDataInicial() 

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
     * Sets the value of field 'dataFinal'.
     * 
     * @param dataFinal the value of field 'dataFinal'.
     */
    public void setDataFinal(java.lang.String dataFinal)
    {
        this._dataFinal = dataFinal;
    } //-- void setDataFinal(java.lang.String) 

    /**
     * Sets the value of field 'dataInicial'.
     * 
     * @param dataInicial the value of field 'dataInicial'.
     */
    public void setDataInicial(java.lang.String dataInicial)
    {
        this._dataInicial = dataInicial;
    } //-- void setDataInicial(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListarHistCodLancamentoRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarhistcodlancamento.request.ListarHistCodLancamentoRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarhistcodlancamento.request.ListarHistCodLancamentoRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarhistcodlancamento.request.ListarHistCodLancamentoRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarhistcodlancamento.request.ListarHistCodLancamentoRequest unmarshal(java.io.Reader) 

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
