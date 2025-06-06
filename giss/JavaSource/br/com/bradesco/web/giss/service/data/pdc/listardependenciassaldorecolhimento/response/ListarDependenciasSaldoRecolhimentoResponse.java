/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ListarDependenciasSaldoRecolhimentoResponse.java,v 1.1 2017/04/11 14:10:41 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldorecolhimento.response;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.util.Enumeration;
import java.util.Vector;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * Class ListarDependenciasSaldoRecolhimentoResponse.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/04/11 14:10:41 $
 */
public class ListarDependenciasSaldoRecolhimentoResponse implements java.io.Serializable {


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
     * Field _quantidadeOcorrencias
     */
    private int _quantidadeOcorrencias = 0;

    /**
     * keeps track of state for field: _quantidadeOcorrencias
     */
    private boolean _has_quantidadeOcorrencias;

    /**
     * Field _indicadorPagamentoTributo
     */
    private java.lang.String _indicadorPagamentoTributo;

    /**
     * Field _indicadorDiaUtil
     */
    private java.lang.String _indicadorDiaUtil;

    /**
     * Field _diaVencimentoTributo
     */
    private int _diaVencimentoTributo = 0;

    /**
     * keeps track of state for field: _diaVencimentoTributo
     */
    private boolean _has_diaVencimentoTributo;

    /**
     * Field _dataRecolhimento
     */
    private java.lang.String _dataRecolhimento;

    /**
     * Field _ocorrenciasList
     */
    private java.util.Vector _ocorrenciasList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarDependenciasSaldoRecolhimentoResponse() 
     {
        super();
        _ocorrenciasList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldorecolhimento.response.ListarDependenciasSaldoRecolhimentoResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addOcorrencias
     * 
     * 
     * 
     * @param vOcorrencias
     */
    public void addOcorrencias(br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldorecolhimento.response.Ocorrencias vOcorrencias)
        throws java.lang.IndexOutOfBoundsException
    {
        _ocorrenciasList.addElement(vOcorrencias);
    } //-- void addOcorrencias(br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldorecolhimento.response.Ocorrencias) 

    /**
     * Method addOcorrencias
     * 
     * 
     * 
     * @param index
     * @param vOcorrencias
     */
    public void addOcorrencias(int index, br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldorecolhimento.response.Ocorrencias vOcorrencias)
        throws java.lang.IndexOutOfBoundsException
    {
        _ocorrenciasList.insertElementAt(vOcorrencias, index);
    } //-- void addOcorrencias(int, br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldorecolhimento.response.Ocorrencias) 

    /**
     * Method deleteDiaVencimentoTributo
     * 
     */
    public void deleteDiaVencimentoTributo()
    {
        this._has_diaVencimentoTributo= false;
    } //-- void deleteDiaVencimentoTributo() 

    /**
     * Method deleteQuantidadeOcorrencias
     * 
     */
    public void deleteQuantidadeOcorrencias()
    {
        this._has_quantidadeOcorrencias= false;
    } //-- void deleteQuantidadeOcorrencias() 

    /**
     * Method enumerateOcorrencias
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateOcorrencias()
    {
        return _ocorrenciasList.elements();
    } //-- java.util.Enumeration enumerateOcorrencias() 

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
     * Returns the value of field 'dataRecolhimento'.
     * 
     * @return String
     * @return the value of field 'dataRecolhimento'.
     */
    public java.lang.String getDataRecolhimento()
    {
        return this._dataRecolhimento;
    } //-- java.lang.String getDataRecolhimento() 

    /**
     * Returns the value of field 'diaVencimentoTributo'.
     * 
     * @return int
     * @return the value of field 'diaVencimentoTributo'.
     */
    public int getDiaVencimentoTributo()
    {
        return this._diaVencimentoTributo;
    } //-- int getDiaVencimentoTributo() 

    /**
     * Returns the value of field 'indicadorDiaUtil'.
     * 
     * @return String
     * @return the value of field 'indicadorDiaUtil'.
     */
    public java.lang.String getIndicadorDiaUtil()
    {
        return this._indicadorDiaUtil;
    } //-- java.lang.String getIndicadorDiaUtil() 

    /**
     * Returns the value of field 'indicadorPagamentoTributo'.
     * 
     * @return String
     * @return the value of field 'indicadorPagamentoTributo'.
     */
    public java.lang.String getIndicadorPagamentoTributo()
    {
        return this._indicadorPagamentoTributo;
    } //-- java.lang.String getIndicadorPagamentoTributo() 

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
     * Method getOcorrencias
     * 
     * 
     * 
     * @param index
     * @return Ocorrencias
     */
    public br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldorecolhimento.response.Ocorrencias getOcorrencias(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _ocorrenciasList.size())) {
            throw new IndexOutOfBoundsException("getOcorrencias: Index value '"+index+"' not in range [0.."+(_ocorrenciasList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldorecolhimento.response.Ocorrencias) _ocorrenciasList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldorecolhimento.response.Ocorrencias getOcorrencias(int) 

    /**
     * Method getOcorrencias
     * 
     * 
     * 
     * @return Ocorrencias
     */
    public br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldorecolhimento.response.Ocorrencias[] getOcorrencias()
    {
        int size = _ocorrenciasList.size();
        br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldorecolhimento.response.Ocorrencias[] mArray = new br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldorecolhimento.response.Ocorrencias[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldorecolhimento.response.Ocorrencias) _ocorrenciasList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldorecolhimento.response.Ocorrencias[] getOcorrencias() 

    /**
     * Method getOcorrenciasCount
     * 
     * 
     * 
     * @return int
     */
    public int getOcorrenciasCount()
    {
        return _ocorrenciasList.size();
    } //-- int getOcorrenciasCount() 

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
     * Method hasDiaVencimentoTributo
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasDiaVencimentoTributo()
    {
        return this._has_diaVencimentoTributo;
    } //-- boolean hasDiaVencimentoTributo() 

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
     * Method removeAllOcorrencias
     * 
     */
    public void removeAllOcorrencias()
    {
        _ocorrenciasList.removeAllElements();
    } //-- void removeAllOcorrencias() 

    /**
     * Method removeOcorrencias
     * 
     * 
     * 
     * @param index
     * @return Ocorrencias
     */
    public br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldorecolhimento.response.Ocorrencias removeOcorrencias(int index)
    {
        java.lang.Object obj = _ocorrenciasList.elementAt(index);
        _ocorrenciasList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldorecolhimento.response.Ocorrencias) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldorecolhimento.response.Ocorrencias removeOcorrencias(int) 

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
     * Sets the value of field 'dataRecolhimento'.
     * 
     * @param dataRecolhimento the value of field 'dataRecolhimento'
     */
    public void setDataRecolhimento(java.lang.String dataRecolhimento)
    {
        this._dataRecolhimento = dataRecolhimento;
    } //-- void setDataRecolhimento(java.lang.String) 

    /**
     * Sets the value of field 'diaVencimentoTributo'.
     * 
     * @param diaVencimentoTributo the value of field
     * 'diaVencimentoTributo'.
     */
    public void setDiaVencimentoTributo(int diaVencimentoTributo)
    {
        this._diaVencimentoTributo = diaVencimentoTributo;
        this._has_diaVencimentoTributo = true;
    } //-- void setDiaVencimentoTributo(int) 

    /**
     * Sets the value of field 'indicadorDiaUtil'.
     * 
     * @param indicadorDiaUtil the value of field 'indicadorDiaUtil'
     */
    public void setIndicadorDiaUtil(java.lang.String indicadorDiaUtil)
    {
        this._indicadorDiaUtil = indicadorDiaUtil;
    } //-- void setIndicadorDiaUtil(java.lang.String) 

    /**
     * Sets the value of field 'indicadorPagamentoTributo'.
     * 
     * @param indicadorPagamentoTributo the value of field
     * 'indicadorPagamentoTributo'.
     */
    public void setIndicadorPagamentoTributo(java.lang.String indicadorPagamentoTributo)
    {
        this._indicadorPagamentoTributo = indicadorPagamentoTributo;
    } //-- void setIndicadorPagamentoTributo(java.lang.String) 

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
     * Method setOcorrencias
     * 
     * 
     * 
     * @param index
     * @param vOcorrencias
     */
    public void setOcorrencias(int index, br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldorecolhimento.response.Ocorrencias vOcorrencias)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _ocorrenciasList.size())) {
            throw new IndexOutOfBoundsException("setOcorrencias: Index value '"+index+"' not in range [0.." + (_ocorrenciasList.size() - 1) + "]");
        }
        _ocorrenciasList.setElementAt(vOcorrencias, index);
    } //-- void setOcorrencias(int, br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldorecolhimento.response.Ocorrencias) 

    /**
     * Method setOcorrencias
     * 
     * 
     * 
     * @param ocorrenciasArray
     */
    public void setOcorrencias(br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldorecolhimento.response.Ocorrencias[] ocorrenciasArray)
    {
        //-- copy array
        _ocorrenciasList.removeAllElements();
        for (int i = 0; i < ocorrenciasArray.length; i++) {
            _ocorrenciasList.addElement(ocorrenciasArray[i]);
        }
    } //-- void setOcorrencias(br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldorecolhimento.response.Ocorrencias) 

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
     * @return ListarDependenciasSaldoRecolhimentoResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldorecolhimento.response.ListarDependenciasSaldoRecolhimentoResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldorecolhimento.response.ListarDependenciasSaldoRecolhimentoResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldorecolhimento.response.ListarDependenciasSaldoRecolhimentoResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldorecolhimento.response.ListarDependenciasSaldoRecolhimentoResponse unmarshal(java.io.Reader) 

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
