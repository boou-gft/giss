/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ListarApuracaoAposFechamentoTotalizaResponse.java,v 1.1 2017/04/11 14:10:16 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response;

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
 * Class ListarApuracaoAposFechamentoTotalizaResponse.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/04/11 14:10:16 $
 */
public class ListarApuracaoAposFechamentoTotalizaResponse implements java.io.Serializable {


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
     * Field _percentualBaseCalculo
     */
    private double _percentualBaseCalculo = 0;

    /**
     * keeps track of state for field: _percentualBaseCalculo
     */
    private boolean _has_percentualBaseCalculo;

    /**
     * Field _percentualAliquotaPadrao
     */
    private double _percentualAliquotaPadrao = 0;

    /**
     * keeps track of state for field: _percentualAliquotaPadrao
     */
    private boolean _has_percentualAliquotaPadrao;

    /**
     * Field _codigoTipoIncidencia
     */
    private java.lang.String _codigoTipoIncidencia;

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
     * Field _ocorrenciasList
     */
    private java.util.Vector _ocorrenciasList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarApuracaoAposFechamentoTotalizaResponse() 
     {
        super();
        _ocorrenciasList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.ListarApuracaoAposFechamentoTotalizaResponse()


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
    public void addOcorrencias(br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Ocorrencias vOcorrencias)
        throws java.lang.IndexOutOfBoundsException
    {
        _ocorrenciasList.addElement(vOcorrencias);
    } //-- void addOcorrencias(br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Ocorrencias) 

    /**
     * Method addOcorrencias
     * 
     * 
     * 
     * @param index
     * @param vOcorrencias
     */
    public void addOcorrencias(int index, br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Ocorrencias vOcorrencias)
        throws java.lang.IndexOutOfBoundsException
    {
        _ocorrenciasList.insertElementAt(vOcorrencias, index);
    } //-- void addOcorrencias(int, br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Ocorrencias) 

    /**
     * Method deleteCodigoSolicitacaoApuracao
     * 
     */
    public void deleteCodigoSolicitacaoApuracao()
    {
        this._has_codigoSolicitacaoApuracao= false;
    } //-- void deleteCodigoSolicitacaoApuracao() 

    /**
     * Method deletePercentualAliquotaPadrao
     * 
     */
    public void deletePercentualAliquotaPadrao()
    {
        this._has_percentualAliquotaPadrao= false;
    } //-- void deletePercentualAliquotaPadrao() 

    /**
     * Method deletePercentualBaseCalculo
     * 
     */
    public void deletePercentualBaseCalculo()
    {
        this._has_percentualBaseCalculo= false;
    } //-- void deletePercentualBaseCalculo() 

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
     * Returns the value of field 'codigoTipoIncidencia'.
     * 
     * @return String
     * @return the value of field 'codigoTipoIncidencia'.
     */
    public java.lang.String getCodigoTipoIncidencia()
    {
        return this._codigoTipoIncidencia;
    } //-- java.lang.String getCodigoTipoIncidencia() 

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
    public br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Ocorrencias getOcorrencias(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _ocorrenciasList.size())) {
            throw new IndexOutOfBoundsException("getOcorrencias: Index value '"+index+"' not in range [0.."+(_ocorrenciasList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Ocorrencias) _ocorrenciasList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Ocorrencias getOcorrencias(int) 

    /**
     * Method getOcorrencias
     * 
     * 
     * 
     * @return Ocorrencias
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Ocorrencias[] getOcorrencias()
    {
        int size = _ocorrenciasList.size();
        br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Ocorrencias[] mArray = new br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Ocorrencias[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Ocorrencias) _ocorrenciasList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Ocorrencias[] getOcorrencias() 

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
     * Returns the value of field 'percentualAliquotaPadrao'.
     * 
     * @return double
     * @return the value of field 'percentualAliquotaPadrao'.
     */
    public double getPercentualAliquotaPadrao()
    {
        return this._percentualAliquotaPadrao;
    } //-- double getPercentualAliquotaPadrao() 

    /**
     * Returns the value of field 'percentualBaseCalculo'.
     * 
     * @return double
     * @return the value of field 'percentualBaseCalculo'.
     */
    public double getPercentualBaseCalculo()
    {
        return this._percentualBaseCalculo;
    } //-- double getPercentualBaseCalculo() 

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
     * Method hasPercentualAliquotaPadrao
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasPercentualAliquotaPadrao()
    {
        return this._has_percentualAliquotaPadrao;
    } //-- boolean hasPercentualAliquotaPadrao() 

    /**
     * Method hasPercentualBaseCalculo
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasPercentualBaseCalculo()
    {
        return this._has_percentualBaseCalculo;
    } //-- boolean hasPercentualBaseCalculo() 

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
    public br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Ocorrencias removeOcorrencias(int index)
    {
        java.lang.Object obj = _ocorrenciasList.elementAt(index);
        _ocorrenciasList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Ocorrencias) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Ocorrencias removeOcorrencias(int) 

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
     * Sets the value of field 'codigoTipoIncidencia'.
     * 
     * @param codigoTipoIncidencia the value of field
     * 'codigoTipoIncidencia'.
     */
    public void setCodigoTipoIncidencia(java.lang.String codigoTipoIncidencia)
    {
        this._codigoTipoIncidencia = codigoTipoIncidencia;
    } //-- void setCodigoTipoIncidencia(java.lang.String) 

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
    public void setOcorrencias(int index, br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Ocorrencias vOcorrencias)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _ocorrenciasList.size())) {
            throw new IndexOutOfBoundsException("setOcorrencias: Index value '"+index+"' not in range [0.." + (_ocorrenciasList.size() - 1) + "]");
        }
        _ocorrenciasList.setElementAt(vOcorrencias, index);
    } //-- void setOcorrencias(int, br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Ocorrencias) 

    /**
     * Method setOcorrencias
     * 
     * 
     * 
     * @param ocorrenciasArray
     */
    public void setOcorrencias(br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Ocorrencias[] ocorrenciasArray)
    {
        //-- copy array
        _ocorrenciasList.removeAllElements();
        for (int i = 0; i < ocorrenciasArray.length; i++) {
            _ocorrenciasList.addElement(ocorrenciasArray[i]);
        }
    } //-- void setOcorrencias(br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Ocorrencias) 

    /**
     * Sets the value of field 'percentualAliquotaPadrao'.
     * 
     * @param percentualAliquotaPadrao the value of field
     * 'percentualAliquotaPadrao'.
     */
    public void setPercentualAliquotaPadrao(double percentualAliquotaPadrao)
    {
        this._percentualAliquotaPadrao = percentualAliquotaPadrao;
        this._has_percentualAliquotaPadrao = true;
    } //-- void setPercentualAliquotaPadrao(double) 

    /**
     * Sets the value of field 'percentualBaseCalculo'.
     * 
     * @param percentualBaseCalculo the value of field
     * 'percentualBaseCalculo'.
     */
    public void setPercentualBaseCalculo(double percentualBaseCalculo)
    {
        this._percentualBaseCalculo = percentualBaseCalculo;
        this._has_percentualBaseCalculo = true;
    } //-- void setPercentualBaseCalculo(double) 

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
     * @return ListarApuracaoAposFechamentoTotalizaResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.ListarApuracaoAposFechamentoTotalizaResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.ListarApuracaoAposFechamentoTotalizaResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.ListarApuracaoAposFechamentoTotalizaResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.ListarApuracaoAposFechamentoTotalizaResponse unmarshal(java.io.Reader) 

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
