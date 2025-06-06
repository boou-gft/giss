/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ListarResulApurMensalDifResponse.java,v 1.1 2017/04/11 14:10:53 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listarresulapurmensaldif.response;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class ListarResulApurMensalDifResponse.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/04/11 14:10:53 $
 */
public class ListarResulApurMensalDifResponse implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

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
     * Field _qtdeRegistro
     */
    private int _qtdeRegistro = 0;

    /**
     * keeps track of state for field: _qtdeRegistro
     */
    private boolean _has_qtdeRegistro;

    /**
     * Field _baseCalculo
     */
    private java.math.BigDecimal _baseCalculo = new java.math.BigDecimal("0");

    /**
     * Field _aliquotaPadrao
     */
    private java.math.BigDecimal _aliquotaPadrao = new java.math.BigDecimal("0");

    /**
     * Field _tipoIncidencia
     */
    private java.lang.String _tipoIncidencia;

    /**
     * Field _solicitacao
     */
    private int _solicitacao = 0;

    /**
     * keeps track of state for field: _solicitacao
     */
    private boolean _has_solicitacao;

    /**
     * Field _dataSolicitacao
     */
    private java.lang.String _dataSolicitacao;

    /**
     * Field _sinalMovimento
     */
    private java.lang.String _sinalMovimento;

    /**
     * Field _valorMovimento
     */
    private java.math.BigDecimal _valorMovimento = new java.math.BigDecimal("0");

    /**
     * Field _sinalTributavel
     */
    private java.lang.String _sinalTributavel;

    /**
     * Field _valorTributavel
     */
    private java.math.BigDecimal _valorTributavel = new java.math.BigDecimal("0");

    /**
     * Field _ocorrenciaApurMensalDifList
     */
    private java.util.Vector<Object> _ocorrenciaApurMensalDifList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarResulApurMensalDifResponse() 
     {
        super();
        setBaseCalculo(new java.math.BigDecimal("0"));
        setAliquotaPadrao(new java.math.BigDecimal("0"));
        setValorMovimento(new java.math.BigDecimal("0"));
        setValorTributavel(new java.math.BigDecimal("0"));
        _ocorrenciaApurMensalDifList = new java.util.Vector<Object>();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarresulapurmensaldif.response.ListarResulApurMensalDifResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addOcorrenciaApurMensalDif
     * 
     * 
     * 
     * @param vOcorrenciaApurMensalDif
     */
    public void addOcorrenciaApurMensalDif(br.com.bradesco.web.giss.service.data.pdc.listarresulapurmensaldif.response.OcorrenciaApurMensalDif vOcorrenciaApurMensalDif)
        throws java.lang.IndexOutOfBoundsException
    {
        _ocorrenciaApurMensalDifList.addElement(vOcorrenciaApurMensalDif);
    } //-- void addOcorrenciaApurMensalDif(br.com.bradesco.web.giss.service.data.pdc.listarresulapurmensaldif.response.OcorrenciaApurMensalDif) 

    /**
     * Method addOcorrenciaApurMensalDif
     * 
     * 
     * 
     * @param index
     * @param vOcorrenciaApurMensalDif
     */
    public void addOcorrenciaApurMensalDif(int index, br.com.bradesco.web.giss.service.data.pdc.listarresulapurmensaldif.response.OcorrenciaApurMensalDif vOcorrenciaApurMensalDif)
        throws java.lang.IndexOutOfBoundsException
    {
        _ocorrenciaApurMensalDifList.insertElementAt(vOcorrenciaApurMensalDif, index);
    } //-- void addOcorrenciaApurMensalDif(int, br.com.bradesco.web.giss.service.data.pdc.listarresulapurmensaldif.response.OcorrenciaApurMensalDif) 

    /**
     * Method deleteQtdeRegistro
     * 
     */
    public void deleteQtdeRegistro()
    {
        this._has_qtdeRegistro= false;
    } //-- void deleteQtdeRegistro() 

    /**
     * Method deleteSolicitacao
     * 
     */
    public void deleteSolicitacao()
    {
        this._has_solicitacao= false;
    } //-- void deleteSolicitacao() 

    /**
     * Method enumerateOcorrenciaApurMensalDif
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration<Object> enumerateOcorrenciaApurMensalDif()
    {
        return _ocorrenciaApurMensalDifList.elements();
    } //-- java.util.Enumeration<Object> enumerateOcorrenciaApurMensalDif() 

    /**
     * Returns the value of field 'aliquotaPadrao'.
     * 
     * @return BigDecimal
     * @return the value of field 'aliquotaPadrao'.
     */
    public java.math.BigDecimal getAliquotaPadrao()
    {
        return this._aliquotaPadrao;
    } //-- java.math.BigDecimal getAliquotaPadrao() 

    /**
     * Returns the value of field 'baseCalculo'.
     * 
     * @return BigDecimal
     * @return the value of field 'baseCalculo'.
     */
    public java.math.BigDecimal getBaseCalculo()
    {
        return this._baseCalculo;
    } //-- java.math.BigDecimal getBaseCalculo() 

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
     * Returns the value of field 'dataSolicitacao'.
     * 
     * @return String
     * @return the value of field 'dataSolicitacao'.
     */
    public java.lang.String getDataSolicitacao()
    {
        return this._dataSolicitacao;
    } //-- java.lang.String getDataSolicitacao() 

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
     * Method getOcorrenciaApurMensalDif
     * 
     * 
     * 
     * @param index
     * @return OcorrenciaApurMensalDif
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarresulapurmensaldif.response.OcorrenciaApurMensalDif getOcorrenciaApurMensalDif(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _ocorrenciaApurMensalDifList.size())) {
            throw new IndexOutOfBoundsException("getOcorrenciaApurMensalDif: Index value '"+index+"' not in range [0.."+(_ocorrenciaApurMensalDifList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.listarresulapurmensaldif.response.OcorrenciaApurMensalDif) _ocorrenciaApurMensalDifList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarresulapurmensaldif.response.OcorrenciaApurMensalDif getOcorrenciaApurMensalDif(int) 

    /**
     * Method getOcorrenciaApurMensalDif
     * 
     * 
     * 
     * @return OcorrenciaApurMensalDif
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarresulapurmensaldif.response.OcorrenciaApurMensalDif[] getOcorrenciaApurMensalDif()
    {
        int size = _ocorrenciaApurMensalDifList.size();
        br.com.bradesco.web.giss.service.data.pdc.listarresulapurmensaldif.response.OcorrenciaApurMensalDif[] mArray = new br.com.bradesco.web.giss.service.data.pdc.listarresulapurmensaldif.response.OcorrenciaApurMensalDif[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.listarresulapurmensaldif.response.OcorrenciaApurMensalDif) _ocorrenciaApurMensalDifList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarresulapurmensaldif.response.OcorrenciaApurMensalDif[] getOcorrenciaApurMensalDif() 

    /**
     * Method getOcorrenciaApurMensalDifCount
     * 
     * 
     * 
     * @return int
     */
    public int getOcorrenciaApurMensalDifCount()
    {
        return _ocorrenciaApurMensalDifList.size();
    } //-- int getOcorrenciaApurMensalDifCount() 

    /**
     * Returns the value of field 'qtdeRegistro'.
     * 
     * @return int
     * @return the value of field 'qtdeRegistro'.
     */
    public int getQtdeRegistro()
    {
        return this._qtdeRegistro;
    } //-- int getQtdeRegistro() 

    /**
     * Returns the value of field 'sinalMovimento'.
     * 
     * @return String
     * @return the value of field 'sinalMovimento'.
     */
    public java.lang.String getSinalMovimento()
    {
        return this._sinalMovimento;
    } //-- java.lang.String getSinalMovimento() 

    /**
     * Returns the value of field 'sinalTributavel'.
     * 
     * @return String
     * @return the value of field 'sinalTributavel'.
     */
    public java.lang.String getSinalTributavel()
    {
        return this._sinalTributavel;
    } //-- java.lang.String getSinalTributavel() 

    /**
     * Returns the value of field 'solicitacao'.
     * 
     * @return int
     * @return the value of field 'solicitacao'.
     */
    public int getSolicitacao()
    {
        return this._solicitacao;
    } //-- int getSolicitacao() 

    /**
     * Returns the value of field 'tipoIncidencia'.
     * 
     * @return String
     * @return the value of field 'tipoIncidencia'.
     */
    public java.lang.String getTipoIncidencia()
    {
        return this._tipoIncidencia;
    } //-- java.lang.String getTipoIncidencia() 

    /**
     * Returns the value of field 'valorMovimento'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorMovimento'.
     */
    public java.math.BigDecimal getValorMovimento()
    {
        return this._valorMovimento;
    } //-- java.math.BigDecimal getValorMovimento() 

    /**
     * Returns the value of field 'valorTributavel'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorTributavel'.
     */
    public java.math.BigDecimal getValorTributavel()
    {
        return this._valorTributavel;
    } //-- java.math.BigDecimal getValorTributavel() 

    /**
     * Method hasQtdeRegistro
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasQtdeRegistro()
    {
        return this._has_qtdeRegistro;
    } //-- boolean hasQtdeRegistro() 

    /**
     * Method hasSolicitacao
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasSolicitacao()
    {
        return this._has_solicitacao;
    } //-- boolean hasSolicitacao() 

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
     * Method removeAllOcorrenciaApurMensalDif
     * 
     */
    public void removeAllOcorrenciaApurMensalDif()
    {
        _ocorrenciaApurMensalDifList.removeAllElements();
    } //-- void removeAllOcorrenciaApurMensalDif() 

    /**
     * Method removeOcorrenciaApurMensalDif
     * 
     * 
     * 
     * @param index
     * @return OcorrenciaApurMensalDif
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarresulapurmensaldif.response.OcorrenciaApurMensalDif removeOcorrenciaApurMensalDif(int index)
    {
        java.lang.Object obj = _ocorrenciaApurMensalDifList.elementAt(index);
        _ocorrenciaApurMensalDifList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.listarresulapurmensaldif.response.OcorrenciaApurMensalDif) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarresulapurmensaldif.response.OcorrenciaApurMensalDif removeOcorrenciaApurMensalDif(int) 

    /**
     * Sets the value of field 'aliquotaPadrao'.
     * 
     * @param aliquotaPadrao the value of field 'aliquotaPadrao'.
     */
    public void setAliquotaPadrao(java.math.BigDecimal aliquotaPadrao)
    {
        this._aliquotaPadrao = aliquotaPadrao;
    } //-- void setAliquotaPadrao(java.math.BigDecimal) 

    /**
     * Sets the value of field 'baseCalculo'.
     * 
     * @param baseCalculo the value of field 'baseCalculo'.
     */
    public void setBaseCalculo(java.math.BigDecimal baseCalculo)
    {
        this._baseCalculo = baseCalculo;
    } //-- void setBaseCalculo(java.math.BigDecimal) 

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
     * Sets the value of field 'dataSolicitacao'.
     * 
     * @param dataSolicitacao the value of field 'dataSolicitacao'.
     */
    public void setDataSolicitacao(java.lang.String dataSolicitacao)
    {
        this._dataSolicitacao = dataSolicitacao;
    } //-- void setDataSolicitacao(java.lang.String) 

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
     * Method setOcorrenciaApurMensalDif
     * 
     * 
     * 
     * @param index
     * @param vOcorrenciaApurMensalDif
     */
    public void setOcorrenciaApurMensalDif(int index, br.com.bradesco.web.giss.service.data.pdc.listarresulapurmensaldif.response.OcorrenciaApurMensalDif vOcorrenciaApurMensalDif)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _ocorrenciaApurMensalDifList.size())) {
            throw new IndexOutOfBoundsException("setOcorrenciaApurMensalDif: Index value '"+index+"' not in range [0.." + (_ocorrenciaApurMensalDifList.size() - 1) + "]");
        }
        _ocorrenciaApurMensalDifList.setElementAt(vOcorrenciaApurMensalDif, index);
    } //-- void setOcorrenciaApurMensalDif(int, br.com.bradesco.web.giss.service.data.pdc.listarresulapurmensaldif.response.OcorrenciaApurMensalDif) 

    /**
     * Method setOcorrenciaApurMensalDif
     * 
     * 
     * 
     * @param ocorrenciaApurMensalDifArray
     */
    public void setOcorrenciaApurMensalDif(br.com.bradesco.web.giss.service.data.pdc.listarresulapurmensaldif.response.OcorrenciaApurMensalDif[] ocorrenciaApurMensalDifArray)
    {
        //-- copy array
        _ocorrenciaApurMensalDifList.removeAllElements();
        for (int i = 0; i < ocorrenciaApurMensalDifArray.length; i++) {
            _ocorrenciaApurMensalDifList.addElement(ocorrenciaApurMensalDifArray[i]);
        }
    } //-- void setOcorrenciaApurMensalDif(br.com.bradesco.web.giss.service.data.pdc.listarresulapurmensaldif.response.OcorrenciaApurMensalDif) 

    /**
     * Sets the value of field 'qtdeRegistro'.
     * 
     * @param qtdeRegistro the value of field 'qtdeRegistro'.
     */
    public void setQtdeRegistro(int qtdeRegistro)
    {
        this._qtdeRegistro = qtdeRegistro;
        this._has_qtdeRegistro = true;
    } //-- void setQtdeRegistro(int) 

    /**
     * Sets the value of field 'sinalMovimento'.
     * 
     * @param sinalMovimento the value of field 'sinalMovimento'.
     */
    public void setSinalMovimento(java.lang.String sinalMovimento)
    {
        this._sinalMovimento = sinalMovimento;
    } //-- void setSinalMovimento(java.lang.String) 

    /**
     * Sets the value of field 'sinalTributavel'.
     * 
     * @param sinalTributavel the value of field 'sinalTributavel'.
     */
    public void setSinalTributavel(java.lang.String sinalTributavel)
    {
        this._sinalTributavel = sinalTributavel;
    } //-- void setSinalTributavel(java.lang.String) 

    /**
     * Sets the value of field 'solicitacao'.
     * 
     * @param solicitacao the value of field 'solicitacao'.
     */
    public void setSolicitacao(int solicitacao)
    {
        this._solicitacao = solicitacao;
        this._has_solicitacao = true;
    } //-- void setSolicitacao(int) 

    /**
     * Sets the value of field 'tipoIncidencia'.
     * 
     * @param tipoIncidencia the value of field 'tipoIncidencia'.
     */
    public void setTipoIncidencia(java.lang.String tipoIncidencia)
    {
        this._tipoIncidencia = tipoIncidencia;
    } //-- void setTipoIncidencia(java.lang.String) 

    /**
     * Sets the value of field 'valorMovimento'.
     * 
     * @param valorMovimento the value of field 'valorMovimento'.
     */
    public void setValorMovimento(java.math.BigDecimal valorMovimento)
    {
        this._valorMovimento = valorMovimento;
    } //-- void setValorMovimento(java.math.BigDecimal) 

    /**
     * Sets the value of field 'valorTributavel'.
     * 
     * @param valorTributavel the value of field 'valorTributavel'.
     */
    public void setValorTributavel(java.math.BigDecimal valorTributavel)
    {
        this._valorTributavel = valorTributavel;
    } //-- void setValorTributavel(java.math.BigDecimal) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListarResulApurMensalDifResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarresulapurmensaldif.response.ListarResulApurMensalDifResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarresulapurmensaldif.response.ListarResulApurMensalDifResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarresulapurmensaldif.response.ListarResulApurMensalDifResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarresulapurmensaldif.response.ListarResulApurMensalDifResponse unmarshal(java.io.Reader) 

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
