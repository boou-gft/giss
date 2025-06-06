/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.listaapuracaoparcialfinal.response;

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
 * Class ListaApuracaoParcialFinalResponse.
 * 
 * @version $Revision$ $Date$
 */
public class ListaApuracaoParcialFinalResponse implements java.io.Serializable {


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
     * Field _numeroConsultas
     */
    private int _numeroConsultas = 0;

    /**
     * keeps track of state for field: _numeroConsultas
     */
    private boolean _has_numeroConsultas;

    /**
     * Field _baseCalculoTributario
     */
    private double _baseCalculoTributario = 0;

    /**
     * keeps track of state for field: _baseCalculoTributario
     */
    private boolean _has_baseCalculoTributario;

    /**
     * Field _aliquotaPadraoMunicipio
     */
    private double _aliquotaPadraoMunicipio = 0;

    /**
     * keeps track of state for field: _aliquotaPadraoMunicipio
     */
    private boolean _has_aliquotaPadraoMunicipio;

    /**
     * Field _tipoIncidenteTributario
     */
    private java.lang.String _tipoIncidenteTributario;

    /**
     * Field _numeroApuracao
     */
    private int _numeroApuracao = 0;

    /**
     * keeps track of state for field: _numeroApuracao
     */
    private boolean _has_numeroApuracao;

    /**
     * Field _dataApuracao
     */
    private java.lang.String _dataApuracao;

    /**
     * Field _horaProcessamento
     */
    private java.lang.String _horaProcessamento;

    /**
     * Field _totalValorMovimentoSinal
     */
    private java.lang.String _totalValorMovimentoSinal;

    /**
     * Field _totalValorMovimento
     */
    private double _totalValorMovimento = 0;

    /**
     * keeps track of state for field: _totalValorMovimento
     */
    private boolean _has_totalValorMovimento;

    /**
     * Field _totalValorTribuSinal
     */
    private java.lang.String _totalValorTribuSinal;

    /**
     * Field _totalValorTribu
     */
    private double _totalValorTribu = 0;

    /**
     * keeps track of state for field: _totalValorTribu
     */
    private boolean _has_totalValorTribu;

    /**
     * Field _totalValorIssSinal
     */
    private java.lang.String _totalValorIssSinal;

    /**
     * Field _totalValorIss
     */
    private double _totalValorIss = 0;

    /**
     * keeps track of state for field: _totalValorIss
     */
    private boolean _has_totalValorIss;

    /**
     * Field _ocorrenciasList
     */
    private java.util.Vector _ocorrenciasList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListaApuracaoParcialFinalResponse() 
     {
        super();
        _ocorrenciasList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listaapuracaoparcialfinal.response.ListaApuracaoParcialFinalResponse()


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
    public void addOcorrencias(br.com.bradesco.web.giss.service.data.pdc.listaapuracaoparcialfinal.response.Ocorrencias vOcorrencias)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_ocorrenciasList.size() < 300)) {
            throw new IndexOutOfBoundsException("addOcorrencias has a maximum of 300");
        }
        _ocorrenciasList.addElement(vOcorrencias);
    } //-- void addOcorrencias(br.com.bradesco.web.giss.service.data.pdc.listaapuracaoparcialfinal.response.Ocorrencias) 

    /**
     * Method addOcorrencias
     * 
     * 
     * 
     * @param index
     * @param vOcorrencias
     */
    public void addOcorrencias(int index, br.com.bradesco.web.giss.service.data.pdc.listaapuracaoparcialfinal.response.Ocorrencias vOcorrencias)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_ocorrenciasList.size() < 300)) {
            throw new IndexOutOfBoundsException("addOcorrencias has a maximum of 300");
        }
        _ocorrenciasList.insertElementAt(vOcorrencias, index);
    } //-- void addOcorrencias(int, br.com.bradesco.web.giss.service.data.pdc.listaapuracaoparcialfinal.response.Ocorrencias) 

    /**
     * Method deleteAliquotaPadraoMunicipio
     * 
     */
    public void deleteAliquotaPadraoMunicipio()
    {
        this._has_aliquotaPadraoMunicipio= false;
    } //-- void deleteAliquotaPadraoMunicipio() 

    /**
     * Method deleteBaseCalculoTributario
     * 
     */
    public void deleteBaseCalculoTributario()
    {
        this._has_baseCalculoTributario= false;
    } //-- void deleteBaseCalculoTributario() 

    /**
     * Method deleteNumeroApuracao
     * 
     */
    public void deleteNumeroApuracao()
    {
        this._has_numeroApuracao= false;
    } //-- void deleteNumeroApuracao() 

    /**
     * Method deleteNumeroConsultas
     * 
     */
    public void deleteNumeroConsultas()
    {
        this._has_numeroConsultas= false;
    } //-- void deleteNumeroConsultas() 

    /**
     * Method deleteTotalValorIss
     * 
     */
    public void deleteTotalValorIss()
    {
        this._has_totalValorIss= false;
    } //-- void deleteTotalValorIss() 

    /**
     * Method deleteTotalValorMovimento
     * 
     */
    public void deleteTotalValorMovimento()
    {
        this._has_totalValorMovimento= false;
    } //-- void deleteTotalValorMovimento() 

    /**
     * Method deleteTotalValorTribu
     * 
     */
    public void deleteTotalValorTribu()
    {
        this._has_totalValorTribu= false;
    } //-- void deleteTotalValorTribu() 

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
     * Returns the value of field 'aliquotaPadraoMunicipio'.
     * 
     * @return double
     * @return the value of field 'aliquotaPadraoMunicipio'.
     */
    public double getAliquotaPadraoMunicipio()
    {
        return this._aliquotaPadraoMunicipio;
    } //-- double getAliquotaPadraoMunicipio() 

    /**
     * Returns the value of field 'baseCalculoTributario'.
     * 
     * @return double
     * @return the value of field 'baseCalculoTributario'.
     */
    public double getBaseCalculoTributario()
    {
        return this._baseCalculoTributario;
    } //-- double getBaseCalculoTributario() 

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
     * Returns the value of field 'dataApuracao'.
     * 
     * @return String
     * @return the value of field 'dataApuracao'.
     */
    public java.lang.String getDataApuracao()
    {
        return this._dataApuracao;
    } //-- java.lang.String getDataApuracao() 

    /**
     * Returns the value of field 'horaProcessamento'.
     * 
     * @return String
     * @return the value of field 'horaProcessamento'.
     */
    public java.lang.String getHoraProcessamento()
    {
        return this._horaProcessamento;
    } //-- java.lang.String getHoraProcessamento() 

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
     * Returns the value of field 'numeroApuracao'.
     * 
     * @return int
     * @return the value of field 'numeroApuracao'.
     */
    public int getNumeroApuracao()
    {
        return this._numeroApuracao;
    } //-- int getNumeroApuracao() 

    /**
     * Returns the value of field 'numeroConsultas'.
     * 
     * @return int
     * @return the value of field 'numeroConsultas'.
     */
    public int getNumeroConsultas()
    {
        return this._numeroConsultas;
    } //-- int getNumeroConsultas() 

    /**
     * Method getOcorrencias
     * 
     * 
     * 
     * @param index
     * @return Ocorrencias
     */
    public br.com.bradesco.web.giss.service.data.pdc.listaapuracaoparcialfinal.response.Ocorrencias getOcorrencias(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _ocorrenciasList.size())) {
            throw new IndexOutOfBoundsException("getOcorrencias: Index value '"+index+"' not in range [0.."+(_ocorrenciasList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.listaapuracaoparcialfinal.response.Ocorrencias) _ocorrenciasList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listaapuracaoparcialfinal.response.Ocorrencias getOcorrencias(int) 

    /**
     * Method getOcorrencias
     * 
     * 
     * 
     * @return Ocorrencias
     */
    public br.com.bradesco.web.giss.service.data.pdc.listaapuracaoparcialfinal.response.Ocorrencias[] getOcorrencias()
    {
        int size = _ocorrenciasList.size();
        br.com.bradesco.web.giss.service.data.pdc.listaapuracaoparcialfinal.response.Ocorrencias[] mArray = new br.com.bradesco.web.giss.service.data.pdc.listaapuracaoparcialfinal.response.Ocorrencias[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.listaapuracaoparcialfinal.response.Ocorrencias) _ocorrenciasList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listaapuracaoparcialfinal.response.Ocorrencias[] getOcorrencias() 

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
     * Returns the value of field 'tipoIncidenteTributario'.
     * 
     * @return String
     * @return the value of field 'tipoIncidenteTributario'.
     */
    public java.lang.String getTipoIncidenteTributario()
    {
        return this._tipoIncidenteTributario;
    } //-- java.lang.String getTipoIncidenteTributario() 

    /**
     * Returns the value of field 'totalValorIss'.
     * 
     * @return double
     * @return the value of field 'totalValorIss'.
     */
    public double getTotalValorIss()
    {
        return this._totalValorIss;
    } //-- double getTotalValorIss() 

    /**
     * Returns the value of field 'totalValorIssSinal'.
     * 
     * @return String
     * @return the value of field 'totalValorIssSinal'.
     */
    public java.lang.String getTotalValorIssSinal()
    {
        return this._totalValorIssSinal;
    } //-- java.lang.String getTotalValorIssSinal() 

    /**
     * Returns the value of field 'totalValorMovimento'.
     * 
     * @return double
     * @return the value of field 'totalValorMovimento'.
     */
    public double getTotalValorMovimento()
    {
        return this._totalValorMovimento;
    } //-- double getTotalValorMovimento() 

    /**
     * Returns the value of field 'totalValorMovimentoSinal'.
     * 
     * @return String
     * @return the value of field 'totalValorMovimentoSinal'.
     */
    public java.lang.String getTotalValorMovimentoSinal()
    {
        return this._totalValorMovimentoSinal;
    } //-- java.lang.String getTotalValorMovimentoSinal() 

    /**
     * Returns the value of field 'totalValorTribu'.
     * 
     * @return double
     * @return the value of field 'totalValorTribu'.
     */
    public double getTotalValorTribu()
    {
        return this._totalValorTribu;
    } //-- double getTotalValorTribu() 

    /**
     * Returns the value of field 'totalValorTribuSinal'.
     * 
     * @return String
     * @return the value of field 'totalValorTribuSinal'.
     */
    public java.lang.String getTotalValorTribuSinal()
    {
        return this._totalValorTribuSinal;
    } //-- java.lang.String getTotalValorTribuSinal() 

    /**
     * Method hasAliquotaPadraoMunicipio
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasAliquotaPadraoMunicipio()
    {
        return this._has_aliquotaPadraoMunicipio;
    } //-- boolean hasAliquotaPadraoMunicipio() 

    /**
     * Method hasBaseCalculoTributario
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasBaseCalculoTributario()
    {
        return this._has_baseCalculoTributario;
    } //-- boolean hasBaseCalculoTributario() 

    /**
     * Method hasNumeroApuracao
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNumeroApuracao()
    {
        return this._has_numeroApuracao;
    } //-- boolean hasNumeroApuracao() 

    /**
     * Method hasNumeroConsultas
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNumeroConsultas()
    {
        return this._has_numeroConsultas;
    } //-- boolean hasNumeroConsultas() 

    /**
     * Method hasTotalValorIss
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasTotalValorIss()
    {
        return this._has_totalValorIss;
    } //-- boolean hasTotalValorIss() 

    /**
     * Method hasTotalValorMovimento
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasTotalValorMovimento()
    {
        return this._has_totalValorMovimento;
    } //-- boolean hasTotalValorMovimento() 

    /**
     * Method hasTotalValorTribu
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasTotalValorTribu()
    {
        return this._has_totalValorTribu;
    } //-- boolean hasTotalValorTribu() 

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
    public br.com.bradesco.web.giss.service.data.pdc.listaapuracaoparcialfinal.response.Ocorrencias removeOcorrencias(int index)
    {
        java.lang.Object obj = _ocorrenciasList.elementAt(index);
        _ocorrenciasList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.listaapuracaoparcialfinal.response.Ocorrencias) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listaapuracaoparcialfinal.response.Ocorrencias removeOcorrencias(int) 

    /**
     * Sets the value of field 'aliquotaPadraoMunicipio'.
     * 
     * @param aliquotaPadraoMunicipio the value of field
     * 'aliquotaPadraoMunicipio'.
     */
    public void setAliquotaPadraoMunicipio(double aliquotaPadraoMunicipio)
    {
        this._aliquotaPadraoMunicipio = aliquotaPadraoMunicipio;
        this._has_aliquotaPadraoMunicipio = true;
    } //-- void setAliquotaPadraoMunicipio(double) 

    /**
     * Sets the value of field 'baseCalculoTributario'.
     * 
     * @param baseCalculoTributario the value of field
     * 'baseCalculoTributario'.
     */
    public void setBaseCalculoTributario(double baseCalculoTributario)
    {
        this._baseCalculoTributario = baseCalculoTributario;
        this._has_baseCalculoTributario = true;
    } //-- void setBaseCalculoTributario(double) 

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
     * Sets the value of field 'dataApuracao'.
     * 
     * @param dataApuracao the value of field 'dataApuracao'.
     */
    public void setDataApuracao(java.lang.String dataApuracao)
    {
        this._dataApuracao = dataApuracao;
    } //-- void setDataApuracao(java.lang.String) 

    /**
     * Sets the value of field 'horaProcessamento'.
     * 
     * @param horaProcessamento the value of field
     * 'horaProcessamento'.
     */
    public void setHoraProcessamento(java.lang.String horaProcessamento)
    {
        this._horaProcessamento = horaProcessamento;
    } //-- void setHoraProcessamento(java.lang.String) 

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
     * Sets the value of field 'numeroApuracao'.
     * 
     * @param numeroApuracao the value of field 'numeroApuracao'.
     */
    public void setNumeroApuracao(int numeroApuracao)
    {
        this._numeroApuracao = numeroApuracao;
        this._has_numeroApuracao = true;
    } //-- void setNumeroApuracao(int) 

    /**
     * Sets the value of field 'numeroConsultas'.
     * 
     * @param numeroConsultas the value of field 'numeroConsultas'.
     */
    public void setNumeroConsultas(int numeroConsultas)
    {
        this._numeroConsultas = numeroConsultas;
        this._has_numeroConsultas = true;
    } //-- void setNumeroConsultas(int) 

    /**
     * Method setOcorrencias
     * 
     * 
     * 
     * @param index
     * @param vOcorrencias
     */
    public void setOcorrencias(int index, br.com.bradesco.web.giss.service.data.pdc.listaapuracaoparcialfinal.response.Ocorrencias vOcorrencias)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _ocorrenciasList.size())) {
            throw new IndexOutOfBoundsException("setOcorrencias: Index value '"+index+"' not in range [0.." + (_ocorrenciasList.size() - 1) + "]");
        }
        if (!(index < 300)) {
            throw new IndexOutOfBoundsException("setOcorrencias has a maximum of 300");
        }
        _ocorrenciasList.setElementAt(vOcorrencias, index);
    } //-- void setOcorrencias(int, br.com.bradesco.web.giss.service.data.pdc.listaapuracaoparcialfinal.response.Ocorrencias) 

    /**
     * Method setOcorrencias
     * 
     * 
     * 
     * @param ocorrenciasArray
     */
    public void setOcorrencias(br.com.bradesco.web.giss.service.data.pdc.listaapuracaoparcialfinal.response.Ocorrencias[] ocorrenciasArray)
    {
        //-- copy array
        _ocorrenciasList.removeAllElements();
        for (int i = 0; i < ocorrenciasArray.length; i++) {
            _ocorrenciasList.addElement(ocorrenciasArray[i]);
        }
    } //-- void setOcorrencias(br.com.bradesco.web.giss.service.data.pdc.listaapuracaoparcialfinal.response.Ocorrencias) 

    /**
     * Sets the value of field 'tipoIncidenteTributario'.
     * 
     * @param tipoIncidenteTributario the value of field
     * 'tipoIncidenteTributario'.
     */
    public void setTipoIncidenteTributario(java.lang.String tipoIncidenteTributario)
    {
        this._tipoIncidenteTributario = tipoIncidenteTributario;
    } //-- void setTipoIncidenteTributario(java.lang.String) 

    /**
     * Sets the value of field 'totalValorIss'.
     * 
     * @param totalValorIss the value of field 'totalValorIss'.
     */
    public void setTotalValorIss(double totalValorIss)
    {
        this._totalValorIss = totalValorIss;
        this._has_totalValorIss = true;
    } //-- void setTotalValorIss(double) 

    /**
     * Sets the value of field 'totalValorIssSinal'.
     * 
     * @param totalValorIssSinal the value of field
     * 'totalValorIssSinal'.
     */
    public void setTotalValorIssSinal(java.lang.String totalValorIssSinal)
    {
        this._totalValorIssSinal = totalValorIssSinal;
    } //-- void setTotalValorIssSinal(java.lang.String) 

    /**
     * Sets the value of field 'totalValorMovimento'.
     * 
     * @param totalValorMovimento the value of field
     * 'totalValorMovimento'.
     */
    public void setTotalValorMovimento(double totalValorMovimento)
    {
        this._totalValorMovimento = totalValorMovimento;
        this._has_totalValorMovimento = true;
    } //-- void setTotalValorMovimento(double) 

    /**
     * Sets the value of field 'totalValorMovimentoSinal'.
     * 
     * @param totalValorMovimentoSinal the value of field
     * 'totalValorMovimentoSinal'.
     */
    public void setTotalValorMovimentoSinal(java.lang.String totalValorMovimentoSinal)
    {
        this._totalValorMovimentoSinal = totalValorMovimentoSinal;
    } //-- void setTotalValorMovimentoSinal(java.lang.String) 

    /**
     * Sets the value of field 'totalValorTribu'.
     * 
     * @param totalValorTribu the value of field 'totalValorTribu'.
     */
    public void setTotalValorTribu(double totalValorTribu)
    {
        this._totalValorTribu = totalValorTribu;
        this._has_totalValorTribu = true;
    } //-- void setTotalValorTribu(double) 

    /**
     * Sets the value of field 'totalValorTribuSinal'.
     * 
     * @param totalValorTribuSinal the value of field
     * 'totalValorTribuSinal'.
     */
    public void setTotalValorTribuSinal(java.lang.String totalValorTribuSinal)
    {
        this._totalValorTribuSinal = totalValorTribuSinal;
    } //-- void setTotalValorTribuSinal(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListaApuracaoParcialFinalResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listaapuracaoparcialfinal.response.ListaApuracaoParcialFinalResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listaapuracaoparcialfinal.response.ListaApuracaoParcialFinalResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listaapuracaoparcialfinal.response.ListaApuracaoParcialFinalResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listaapuracaoparcialfinal.response.ListaApuracaoParcialFinalResponse unmarshal(java.io.Reader) 

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
