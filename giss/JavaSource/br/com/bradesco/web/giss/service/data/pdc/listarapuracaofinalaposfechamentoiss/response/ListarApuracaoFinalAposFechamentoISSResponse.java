/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.listarapuracaofinalaposfechamentoiss.response;

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
 * Class ListarApuracaoFinalAposFechamentoISSResponse.
 * 
 * @version $Revision$ $Date$
 */
public class ListarApuracaoFinalAposFechamentoISSResponse implements java.io.Serializable {


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
     * Field _porcBaseCalculoTribu
     */
    private double _porcBaseCalculoTribu = 0;

    /**
     * keeps track of state for field: _porcBaseCalculoTribu
     */
    private boolean _has_porcBaseCalculoTribu;

    /**
     * Field _porcAliquotaPadraoMunicipio
     */
    private double _porcAliquotaPadraoMunicipio = 0;

    /**
     * keeps track of state for field: _porcAliquotaPadraoMunicipio
     */
    private boolean _has_porcAliquotaPadraoMunicipio;

    /**
     * Field _tipoIncidenteTribu
     */
    private java.lang.String _tipoIncidenteTribu;

    /**
     * Field _dataProcessamento
     */
    private java.lang.String _dataProcessamento;

    /**
     * Field _codigoDependencia
     */
    private int _codigoDependencia = 0;

    /**
     * keeps track of state for field: _codigoDependencia
     */
    private boolean _has_codigoDependencia;

    /**
     * Field _descDependencia
     */
    private java.lang.String _descDependencia;

    /**
     * Field _codMunicipio
     */
    private long _codMunicipio = 0;

    /**
     * keeps track of state for field: _codMunicipio
     */
    private boolean _has_codMunicipio;

    /**
     * Field _descMunicipio
     */
    private java.lang.String _descMunicipio;

    /**
     * Field _uf
     */
    private java.lang.String _uf;

    /**
     * Field _movimentoSinal
     */
    private java.lang.String _movimentoSinal;

    /**
     * Field _movimentoValor
     */
    private double _movimentoValor = 0;

    /**
     * keeps track of state for field: _movimentoValor
     */
    private boolean _has_movimentoValor;

    /**
     * Field _tribuSinal
     */
    private java.lang.String _tribuSinal;

    /**
     * Field _tribuValor
     */
    private double _tribuValor = 0;

    /**
     * keeps track of state for field: _tribuValor
     */
    private boolean _has_tribuValor;

    /**
     * Field _totalIssSinal
     */
    private java.lang.String _totalIssSinal;

    /**
     * Field _totalIssValor
     */
    private double _totalIssValor = 0;

    /**
     * keeps track of state for field: _totalIssValor
     */
    private boolean _has_totalIssValor;

    /**
     * Field _ocorrenciasList
     */
    private java.util.Vector _ocorrenciasList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarApuracaoFinalAposFechamentoISSResponse() 
     {
        super();
        _ocorrenciasList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaofinalaposfechamentoiss.response.ListarApuracaoFinalAposFechamentoISSResponse()


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
    public void addOcorrencias(br.com.bradesco.web.giss.service.data.pdc.listarapuracaofinalaposfechamentoiss.response.Ocorrencias vOcorrencias)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_ocorrenciasList.size() < 250)) {
            throw new IndexOutOfBoundsException("addOcorrencias has a maximum of 250");
        }
        _ocorrenciasList.addElement(vOcorrencias);
    } //-- void addOcorrencias(br.com.bradesco.web.giss.service.data.pdc.listarapuracaofinalaposfechamentoiss.response.Ocorrencias) 

    /**
     * Method addOcorrencias
     * 
     * 
     * 
     * @param index
     * @param vOcorrencias
     */
    public void addOcorrencias(int index, br.com.bradesco.web.giss.service.data.pdc.listarapuracaofinalaposfechamentoiss.response.Ocorrencias vOcorrencias)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_ocorrenciasList.size() < 250)) {
            throw new IndexOutOfBoundsException("addOcorrencias has a maximum of 250");
        }
        _ocorrenciasList.insertElementAt(vOcorrencias, index);
    } //-- void addOcorrencias(int, br.com.bradesco.web.giss.service.data.pdc.listarapuracaofinalaposfechamentoiss.response.Ocorrencias) 

    /**
     * Method deleteCodMunicipio
     * 
     */
    public void deleteCodMunicipio()
    {
        this._has_codMunicipio= false;
    } //-- void deleteCodMunicipio() 

    /**
     * Method deleteCodigoDependencia
     * 
     */
    public void deleteCodigoDependencia()
    {
        this._has_codigoDependencia= false;
    } //-- void deleteCodigoDependencia() 

    /**
     * Method deleteMovimentoValor
     * 
     */
    public void deleteMovimentoValor()
    {
        this._has_movimentoValor= false;
    } //-- void deleteMovimentoValor() 

    /**
     * Method deleteNumeroConsultas
     * 
     */
    public void deleteNumeroConsultas()
    {
        this._has_numeroConsultas= false;
    } //-- void deleteNumeroConsultas() 

    /**
     * Method deletePorcAliquotaPadraoMunicipio
     * 
     */
    public void deletePorcAliquotaPadraoMunicipio()
    {
        this._has_porcAliquotaPadraoMunicipio= false;
    } //-- void deletePorcAliquotaPadraoMunicipio() 

    /**
     * Method deletePorcBaseCalculoTribu
     * 
     */
    public void deletePorcBaseCalculoTribu()
    {
        this._has_porcBaseCalculoTribu= false;
    } //-- void deletePorcBaseCalculoTribu() 

    /**
     * Method deleteTotalIssValor
     * 
     */
    public void deleteTotalIssValor()
    {
        this._has_totalIssValor= false;
    } //-- void deleteTotalIssValor() 

    /**
     * Method deleteTribuValor
     * 
     */
    public void deleteTribuValor()
    {
        this._has_tribuValor= false;
    } //-- void deleteTribuValor() 

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
     * Returns the value of field 'codMunicipio'.
     * 
     * @return long
     * @return the value of field 'codMunicipio'.
     */
    public long getCodMunicipio()
    {
        return this._codMunicipio;
    } //-- long getCodMunicipio() 

    /**
     * Returns the value of field 'codigoDependencia'.
     * 
     * @return int
     * @return the value of field 'codigoDependencia'.
     */
    public int getCodigoDependencia()
    {
        return this._codigoDependencia;
    } //-- int getCodigoDependencia() 

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
     * Returns the value of field 'descDependencia'.
     * 
     * @return String
     * @return the value of field 'descDependencia'.
     */
    public java.lang.String getDescDependencia()
    {
        return this._descDependencia;
    } //-- java.lang.String getDescDependencia() 

    /**
     * Returns the value of field 'descMunicipio'.
     * 
     * @return String
     * @return the value of field 'descMunicipio'.
     */
    public java.lang.String getDescMunicipio()
    {
        return this._descMunicipio;
    } //-- java.lang.String getDescMunicipio() 

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
     * Returns the value of field 'movimentoSinal'.
     * 
     * @return String
     * @return the value of field 'movimentoSinal'.
     */
    public java.lang.String getMovimentoSinal()
    {
        return this._movimentoSinal;
    } //-- java.lang.String getMovimentoSinal() 

    /**
     * Returns the value of field 'movimentoValor'.
     * 
     * @return double
     * @return the value of field 'movimentoValor'.
     */
    public double getMovimentoValor()
    {
        return this._movimentoValor;
    } //-- double getMovimentoValor() 

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
    public br.com.bradesco.web.giss.service.data.pdc.listarapuracaofinalaposfechamentoiss.response.Ocorrencias getOcorrencias(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _ocorrenciasList.size())) {
            throw new IndexOutOfBoundsException("getOcorrencias: Index value '"+index+"' not in range [0.."+(_ocorrenciasList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.listarapuracaofinalaposfechamentoiss.response.Ocorrencias) _ocorrenciasList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaofinalaposfechamentoiss.response.Ocorrencias getOcorrencias(int) 

    /**
     * Method getOcorrencias
     * 
     * 
     * 
     * @return Ocorrencias
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarapuracaofinalaposfechamentoiss.response.Ocorrencias[] getOcorrencias()
    {
        int size = _ocorrenciasList.size();
        br.com.bradesco.web.giss.service.data.pdc.listarapuracaofinalaposfechamentoiss.response.Ocorrencias[] mArray = new br.com.bradesco.web.giss.service.data.pdc.listarapuracaofinalaposfechamentoiss.response.Ocorrencias[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.listarapuracaofinalaposfechamentoiss.response.Ocorrencias) _ocorrenciasList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaofinalaposfechamentoiss.response.Ocorrencias[] getOcorrencias() 

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
     * Returns the value of field 'porcAliquotaPadraoMunicipio'.
     * 
     * @return double
     * @return the value of field 'porcAliquotaPadraoMunicipio'.
     */
    public double getPorcAliquotaPadraoMunicipio()
    {
        return this._porcAliquotaPadraoMunicipio;
    } //-- double getPorcAliquotaPadraoMunicipio() 

    /**
     * Returns the value of field 'porcBaseCalculoTribu'.
     * 
     * @return double
     * @return the value of field 'porcBaseCalculoTribu'.
     */
    public double getPorcBaseCalculoTribu()
    {
        return this._porcBaseCalculoTribu;
    } //-- double getPorcBaseCalculoTribu() 

    /**
     * Returns the value of field 'tipoIncidenteTribu'.
     * 
     * @return String
     * @return the value of field 'tipoIncidenteTribu'.
     */
    public java.lang.String getTipoIncidenteTribu()
    {
        return this._tipoIncidenteTribu;
    } //-- java.lang.String getTipoIncidenteTribu() 

    /**
     * Returns the value of field 'totalIssSinal'.
     * 
     * @return String
     * @return the value of field 'totalIssSinal'.
     */
    public java.lang.String getTotalIssSinal()
    {
        return this._totalIssSinal;
    } //-- java.lang.String getTotalIssSinal() 

    /**
     * Returns the value of field 'totalIssValor'.
     * 
     * @return double
     * @return the value of field 'totalIssValor'.
     */
    public double getTotalIssValor()
    {
        return this._totalIssValor;
    } //-- double getTotalIssValor() 

    /**
     * Returns the value of field 'tribuSinal'.
     * 
     * @return String
     * @return the value of field 'tribuSinal'.
     */
    public java.lang.String getTribuSinal()
    {
        return this._tribuSinal;
    } //-- java.lang.String getTribuSinal() 

    /**
     * Returns the value of field 'tribuValor'.
     * 
     * @return double
     * @return the value of field 'tribuValor'.
     */
    public double getTribuValor()
    {
        return this._tribuValor;
    } //-- double getTribuValor() 

    /**
     * Returns the value of field 'uf'.
     * 
     * @return String
     * @return the value of field 'uf'.
     */
    public java.lang.String getUf()
    {
        return this._uf;
    } //-- java.lang.String getUf() 

    /**
     * Method hasCodMunicipio
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodMunicipio()
    {
        return this._has_codMunicipio;
    } //-- boolean hasCodMunicipio() 

    /**
     * Method hasCodigoDependencia
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoDependencia()
    {
        return this._has_codigoDependencia;
    } //-- boolean hasCodigoDependencia() 

    /**
     * Method hasMovimentoValor
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasMovimentoValor()
    {
        return this._has_movimentoValor;
    } //-- boolean hasMovimentoValor() 

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
     * Method hasPorcAliquotaPadraoMunicipio
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasPorcAliquotaPadraoMunicipio()
    {
        return this._has_porcAliquotaPadraoMunicipio;
    } //-- boolean hasPorcAliquotaPadraoMunicipio() 

    /**
     * Method hasPorcBaseCalculoTribu
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasPorcBaseCalculoTribu()
    {
        return this._has_porcBaseCalculoTribu;
    } //-- boolean hasPorcBaseCalculoTribu() 

    /**
     * Method hasTotalIssValor
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasTotalIssValor()
    {
        return this._has_totalIssValor;
    } //-- boolean hasTotalIssValor() 

    /**
     * Method hasTribuValor
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasTribuValor()
    {
        return this._has_tribuValor;
    } //-- boolean hasTribuValor() 

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
    public br.com.bradesco.web.giss.service.data.pdc.listarapuracaofinalaposfechamentoiss.response.Ocorrencias removeOcorrencias(int index)
    {
        java.lang.Object obj = _ocorrenciasList.elementAt(index);
        _ocorrenciasList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.listarapuracaofinalaposfechamentoiss.response.Ocorrencias) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaofinalaposfechamentoiss.response.Ocorrencias removeOcorrencias(int) 

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
     * Sets the value of field 'codMunicipio'.
     * 
     * @param codMunicipio the value of field 'codMunicipio'.
     */
    public void setCodMunicipio(long codMunicipio)
    {
        this._codMunicipio = codMunicipio;
        this._has_codMunicipio = true;
    } //-- void setCodMunicipio(long) 

    /**
     * Sets the value of field 'codigoDependencia'.
     * 
     * @param codigoDependencia the value of field
     * 'codigoDependencia'.
     */
    public void setCodigoDependencia(int codigoDependencia)
    {
        this._codigoDependencia = codigoDependencia;
        this._has_codigoDependencia = true;
    } //-- void setCodigoDependencia(int) 

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
     * Sets the value of field 'descDependencia'.
     * 
     * @param descDependencia the value of field 'descDependencia'.
     */
    public void setDescDependencia(java.lang.String descDependencia)
    {
        this._descDependencia = descDependencia;
    } //-- void setDescDependencia(java.lang.String) 

    /**
     * Sets the value of field 'descMunicipio'.
     * 
     * @param descMunicipio the value of field 'descMunicipio'.
     */
    public void setDescMunicipio(java.lang.String descMunicipio)
    {
        this._descMunicipio = descMunicipio;
    } //-- void setDescMunicipio(java.lang.String) 

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
     * Sets the value of field 'movimentoSinal'.
     * 
     * @param movimentoSinal the value of field 'movimentoSinal'.
     */
    public void setMovimentoSinal(java.lang.String movimentoSinal)
    {
        this._movimentoSinal = movimentoSinal;
    } //-- void setMovimentoSinal(java.lang.String) 

    /**
     * Sets the value of field 'movimentoValor'.
     * 
     * @param movimentoValor the value of field 'movimentoValor'.
     */
    public void setMovimentoValor(double movimentoValor)
    {
        this._movimentoValor = movimentoValor;
        this._has_movimentoValor = true;
    } //-- void setMovimentoValor(double) 

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
    public void setOcorrencias(int index, br.com.bradesco.web.giss.service.data.pdc.listarapuracaofinalaposfechamentoiss.response.Ocorrencias vOcorrencias)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _ocorrenciasList.size())) {
            throw new IndexOutOfBoundsException("setOcorrencias: Index value '"+index+"' not in range [0.." + (_ocorrenciasList.size() - 1) + "]");
        }
        if (!(index < 250)) {
            throw new IndexOutOfBoundsException("setOcorrencias has a maximum of 250");
        }
        _ocorrenciasList.setElementAt(vOcorrencias, index);
    } //-- void setOcorrencias(int, br.com.bradesco.web.giss.service.data.pdc.listarapuracaofinalaposfechamentoiss.response.Ocorrencias) 

    /**
     * Method setOcorrencias
     * 
     * 
     * 
     * @param ocorrenciasArray
     */
    public void setOcorrencias(br.com.bradesco.web.giss.service.data.pdc.listarapuracaofinalaposfechamentoiss.response.Ocorrencias[] ocorrenciasArray)
    {
        //-- copy array
        _ocorrenciasList.removeAllElements();
        for (int i = 0; i < ocorrenciasArray.length; i++) {
            _ocorrenciasList.addElement(ocorrenciasArray[i]);
        }
    } //-- void setOcorrencias(br.com.bradesco.web.giss.service.data.pdc.listarapuracaofinalaposfechamentoiss.response.Ocorrencias) 

    /**
     * Sets the value of field 'porcAliquotaPadraoMunicipio'.
     * 
     * @param porcAliquotaPadraoMunicipio the value of field
     * 'porcAliquotaPadraoMunicipio'.
     */
    public void setPorcAliquotaPadraoMunicipio(double porcAliquotaPadraoMunicipio)
    {
        this._porcAliquotaPadraoMunicipio = porcAliquotaPadraoMunicipio;
        this._has_porcAliquotaPadraoMunicipio = true;
    } //-- void setPorcAliquotaPadraoMunicipio(double) 

    /**
     * Sets the value of field 'porcBaseCalculoTribu'.
     * 
     * @param porcBaseCalculoTribu the value of field
     * 'porcBaseCalculoTribu'.
     */
    public void setPorcBaseCalculoTribu(double porcBaseCalculoTribu)
    {
        this._porcBaseCalculoTribu = porcBaseCalculoTribu;
        this._has_porcBaseCalculoTribu = true;
    } //-- void setPorcBaseCalculoTribu(double) 

    /**
     * Sets the value of field 'tipoIncidenteTribu'.
     * 
     * @param tipoIncidenteTribu the value of field
     * 'tipoIncidenteTribu'.
     */
    public void setTipoIncidenteTribu(java.lang.String tipoIncidenteTribu)
    {
        this._tipoIncidenteTribu = tipoIncidenteTribu;
    } //-- void setTipoIncidenteTribu(java.lang.String) 

    /**
     * Sets the value of field 'totalIssSinal'.
     * 
     * @param totalIssSinal the value of field 'totalIssSinal'.
     */
    public void setTotalIssSinal(java.lang.String totalIssSinal)
    {
        this._totalIssSinal = totalIssSinal;
    } //-- void setTotalIssSinal(java.lang.String) 

    /**
     * Sets the value of field 'totalIssValor'.
     * 
     * @param totalIssValor the value of field 'totalIssValor'.
     */
    public void setTotalIssValor(double totalIssValor)
    {
        this._totalIssValor = totalIssValor;
        this._has_totalIssValor = true;
    } //-- void setTotalIssValor(double) 

    /**
     * Sets the value of field 'tribuSinal'.
     * 
     * @param tribuSinal the value of field 'tribuSinal'.
     */
    public void setTribuSinal(java.lang.String tribuSinal)
    {
        this._tribuSinal = tribuSinal;
    } //-- void setTribuSinal(java.lang.String) 

    /**
     * Sets the value of field 'tribuValor'.
     * 
     * @param tribuValor the value of field 'tribuValor'.
     */
    public void setTribuValor(double tribuValor)
    {
        this._tribuValor = tribuValor;
        this._has_tribuValor = true;
    } //-- void setTribuValor(double) 

    /**
     * Sets the value of field 'uf'.
     * 
     * @param uf the value of field 'uf'.
     */
    public void setUf(java.lang.String uf)
    {
        this._uf = uf;
    } //-- void setUf(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListarApuracaoFinalAposFechamentoISSResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarapuracaofinalaposfechamentoiss.response.ListarApuracaoFinalAposFechamentoISSResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarapuracaofinalaposfechamentoiss.response.ListarApuracaoFinalAposFechamentoISSResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarapuracaofinalaposfechamentoiss.response.ListarApuracaoFinalAposFechamentoISSResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaofinalaposfechamentoiss.response.ListarApuracaoFinalAposFechamentoISSResponse unmarshal(java.io.Reader) 

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
