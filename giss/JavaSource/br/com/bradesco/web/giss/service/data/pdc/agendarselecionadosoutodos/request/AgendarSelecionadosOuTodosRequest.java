/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.agendarselecionadosoutodos.request;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.math.BigDecimal;
import java.util.Enumeration;
import java.util.Vector;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * Class AgendarSelecionadosOuTodosRequest.
 * 
 * @version $Revision$ $Date$
 */
public class AgendarSelecionadosOuTodosRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codEmpresa
     */
    private int _codEmpresa = 0;

    /**
     * keeps track of state for field: _codEmpresa
     */
    private boolean _has_codEmpresa;

    /**
     * Field _competencia
     */
    private int _competencia = 0;

    /**
     * keeps track of state for field: _competencia
     */
    private boolean _has_competencia;

    /**
     * Field _codProduto
     */
    private int _codProduto = 0;

    /**
     * keeps track of state for field: _codProduto
     */
    private boolean _has_codProduto;

    /**
     * Field _valorMulta
     */
    private java.math.BigDecimal _valorMulta = new java.math.BigDecimal("0");

    /**
     * Field _valorJuros
     */
    private java.math.BigDecimal _valorJuros = new java.math.BigDecimal("0");

    /**
     * Field _tipoAtualizacao
     */
    private java.lang.String _tipoAtualizacao;

    /**
     * Field _qtdeOcorrencias
     */
    private int _qtdeOcorrencias = 0;

    /**
     * keeps track of state for field: _qtdeOcorrencias
     */
    private boolean _has_qtdeOcorrencias;

    /**
     * Field _listaAgendamentoManualList
     */
    private java.util.Vector _listaAgendamentoManualList;


      //----------------/
     //- Constructors -/
    //----------------/

    public AgendarSelecionadosOuTodosRequest() 
     {
        super();
        setValorMulta(new java.math.BigDecimal("0"));
        setValorJuros(new java.math.BigDecimal("0"));
        _listaAgendamentoManualList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.agendarselecionadosoutodos.request.AgendarSelecionadosOuTodosRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addListaAgendamentoManual
     * 
     * 
     * 
     * @param vListaAgendamentoManual
     */
    public void addListaAgendamentoManual(br.com.bradesco.web.giss.service.data.pdc.agendarselecionadosoutodos.request.ListaAgendamentoManual vListaAgendamentoManual)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_listaAgendamentoManualList.size() < 70)) {
            throw new IndexOutOfBoundsException("addListaAgendamentoManual has a maximum of 70");
        }
        _listaAgendamentoManualList.addElement(vListaAgendamentoManual);
    } //-- void addListaAgendamentoManual(br.com.bradesco.web.giss.service.data.pdc.agendarselecionadosoutodos.request.ListaAgendamentoManual) 

    /**
     * Method addListaAgendamentoManual
     * 
     * 
     * 
     * @param index
     * @param vListaAgendamentoManual
     */
    public void addListaAgendamentoManual(int index, br.com.bradesco.web.giss.service.data.pdc.agendarselecionadosoutodos.request.ListaAgendamentoManual vListaAgendamentoManual)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_listaAgendamentoManualList.size() < 70)) {
            throw new IndexOutOfBoundsException("addListaAgendamentoManual has a maximum of 70");
        }
        _listaAgendamentoManualList.insertElementAt(vListaAgendamentoManual, index);
    } //-- void addListaAgendamentoManual(int, br.com.bradesco.web.giss.service.data.pdc.agendarselecionadosoutodos.request.ListaAgendamentoManual) 

    /**
     * Method deleteCodEmpresa
     * 
     */
    public void deleteCodEmpresa()
    {
        this._has_codEmpresa= false;
    } //-- void deleteCodEmpresa() 

    /**
     * Method deleteCodProduto
     * 
     */
    public void deleteCodProduto()
    {
        this._has_codProduto= false;
    } //-- void deleteCodProduto() 

    /**
     * Method deleteCompetencia
     * 
     */
    public void deleteCompetencia()
    {
        this._has_competencia= false;
    } //-- void deleteCompetencia() 

    /**
     * Method deleteQtdeOcorrencias
     * 
     */
    public void deleteQtdeOcorrencias()
    {
        this._has_qtdeOcorrencias= false;
    } //-- void deleteQtdeOcorrencias() 

    /**
     * Method enumerateListaAgendamentoManual
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateListaAgendamentoManual()
    {
        return _listaAgendamentoManualList.elements();
    } //-- java.util.Enumeration enumerateListaAgendamentoManual() 

    /**
     * Returns the value of field 'codEmpresa'.
     * 
     * @return int
     * @return the value of field 'codEmpresa'.
     */
    public int getCodEmpresa()
    {
        return this._codEmpresa;
    } //-- int getCodEmpresa() 

    /**
     * Returns the value of field 'codProduto'.
     * 
     * @return int
     * @return the value of field 'codProduto'.
     */
    public int getCodProduto()
    {
        return this._codProduto;
    } //-- int getCodProduto() 

    /**
     * Returns the value of field 'competencia'.
     * 
     * @return int
     * @return the value of field 'competencia'.
     */
    public int getCompetencia()
    {
        return this._competencia;
    } //-- int getCompetencia() 

    /**
     * Method getListaAgendamentoManual
     * 
     * 
     * 
     * @param index
     * @return ListaAgendamentoManual
     */
    public br.com.bradesco.web.giss.service.data.pdc.agendarselecionadosoutodos.request.ListaAgendamentoManual getListaAgendamentoManual(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaAgendamentoManualList.size())) {
            throw new IndexOutOfBoundsException("getListaAgendamentoManual: Index value '"+index+"' not in range [0.."+(_listaAgendamentoManualList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.agendarselecionadosoutodos.request.ListaAgendamentoManual) _listaAgendamentoManualList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.agendarselecionadosoutodos.request.ListaAgendamentoManual getListaAgendamentoManual(int) 

    /**
     * Method getListaAgendamentoManual
     * 
     * 
     * 
     * @return ListaAgendamentoManual
     */
    public br.com.bradesco.web.giss.service.data.pdc.agendarselecionadosoutodos.request.ListaAgendamentoManual[] getListaAgendamentoManual()
    {
        int size = _listaAgendamentoManualList.size();
        br.com.bradesco.web.giss.service.data.pdc.agendarselecionadosoutodos.request.ListaAgendamentoManual[] mArray = new br.com.bradesco.web.giss.service.data.pdc.agendarselecionadosoutodos.request.ListaAgendamentoManual[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.agendarselecionadosoutodos.request.ListaAgendamentoManual) _listaAgendamentoManualList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.agendarselecionadosoutodos.request.ListaAgendamentoManual[] getListaAgendamentoManual() 

    /**
     * Method getListaAgendamentoManualCount
     * 
     * 
     * 
     * @return int
     */
    public int getListaAgendamentoManualCount()
    {
        return _listaAgendamentoManualList.size();
    } //-- int getListaAgendamentoManualCount() 

    /**
     * Returns the value of field 'qtdeOcorrencias'.
     * 
     * @return int
     * @return the value of field 'qtdeOcorrencias'.
     */
    public int getQtdeOcorrencias()
    {
        return this._qtdeOcorrencias;
    } //-- int getQtdeOcorrencias() 

    /**
     * Returns the value of field 'tipoAtualizacao'.
     * 
     * @return String
     * @return the value of field 'tipoAtualizacao'.
     */
    public java.lang.String getTipoAtualizacao()
    {
        return this._tipoAtualizacao;
    } //-- java.lang.String getTipoAtualizacao() 

    /**
     * Returns the value of field 'valorJuros'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorJuros'.
     */
    public java.math.BigDecimal getValorJuros()
    {
        return this._valorJuros;
    } //-- java.math.BigDecimal getValorJuros() 

    /**
     * Returns the value of field 'valorMulta'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorMulta'.
     */
    public java.math.BigDecimal getValorMulta()
    {
        return this._valorMulta;
    } //-- java.math.BigDecimal getValorMulta() 

    /**
     * Method hasCodEmpresa
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodEmpresa()
    {
        return this._has_codEmpresa;
    } //-- boolean hasCodEmpresa() 

    /**
     * Method hasCodProduto
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodProduto()
    {
        return this._has_codProduto;
    } //-- boolean hasCodProduto() 

    /**
     * Method hasCompetencia
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCompetencia()
    {
        return this._has_competencia;
    } //-- boolean hasCompetencia() 

    /**
     * Method hasQtdeOcorrencias
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasQtdeOcorrencias()
    {
        return this._has_qtdeOcorrencias;
    } //-- boolean hasQtdeOcorrencias() 

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
     * Method removeAllListaAgendamentoManual
     * 
     */
    public void removeAllListaAgendamentoManual()
    {
        _listaAgendamentoManualList.removeAllElements();
    } //-- void removeAllListaAgendamentoManual() 

    /**
     * Method removeListaAgendamentoManual
     * 
     * 
     * 
     * @param index
     * @return ListaAgendamentoManual
     */
    public br.com.bradesco.web.giss.service.data.pdc.agendarselecionadosoutodos.request.ListaAgendamentoManual removeListaAgendamentoManual(int index)
    {
        java.lang.Object obj = _listaAgendamentoManualList.elementAt(index);
        _listaAgendamentoManualList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.agendarselecionadosoutodos.request.ListaAgendamentoManual) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.agendarselecionadosoutodos.request.ListaAgendamentoManual removeListaAgendamentoManual(int) 

    /**
     * Sets the value of field 'codEmpresa'.
     * 
     * @param codEmpresa the value of field 'codEmpresa'.
     */
    public void setCodEmpresa(int codEmpresa)
    {
        this._codEmpresa = codEmpresa;
        this._has_codEmpresa = true;
    } //-- void setCodEmpresa(int) 

    /**
     * Sets the value of field 'codProduto'.
     * 
     * @param codProduto the value of field 'codProduto'.
     */
    public void setCodProduto(int codProduto)
    {
        this._codProduto = codProduto;
        this._has_codProduto = true;
    } //-- void setCodProduto(int) 

    /**
     * Sets the value of field 'competencia'.
     * 
     * @param competencia the value of field 'competencia'.
     */
    public void setCompetencia(int competencia)
    {
        this._competencia = competencia;
        this._has_competencia = true;
    } //-- void setCompetencia(int) 

    /**
     * Method setListaAgendamentoManual
     * 
     * 
     * 
     * @param index
     * @param vListaAgendamentoManual
     */
    public void setListaAgendamentoManual(int index, br.com.bradesco.web.giss.service.data.pdc.agendarselecionadosoutodos.request.ListaAgendamentoManual vListaAgendamentoManual)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaAgendamentoManualList.size())) {
            throw new IndexOutOfBoundsException("setListaAgendamentoManual: Index value '"+index+"' not in range [0.." + (_listaAgendamentoManualList.size() - 1) + "]");
        }
        if (!(index < 70)) {
            throw new IndexOutOfBoundsException("setListaAgendamentoManual has a maximum of 70");
        }
        _listaAgendamentoManualList.setElementAt(vListaAgendamentoManual, index);
    } //-- void setListaAgendamentoManual(int, br.com.bradesco.web.giss.service.data.pdc.agendarselecionadosoutodos.request.ListaAgendamentoManual) 

    /**
     * Method setListaAgendamentoManual
     * 
     * 
     * 
     * @param listaAgendamentoManualArray
     */
    public void setListaAgendamentoManual(br.com.bradesco.web.giss.service.data.pdc.agendarselecionadosoutodos.request.ListaAgendamentoManual[] listaAgendamentoManualArray)
    {
        //-- copy array
        _listaAgendamentoManualList.removeAllElements();
        for (int i = 0; i < listaAgendamentoManualArray.length; i++) {
            _listaAgendamentoManualList.addElement(listaAgendamentoManualArray[i]);
        }
    } //-- void setListaAgendamentoManual(br.com.bradesco.web.giss.service.data.pdc.agendarselecionadosoutodos.request.ListaAgendamentoManual) 

    /**
     * Sets the value of field 'qtdeOcorrencias'.
     * 
     * @param qtdeOcorrencias the value of field 'qtdeOcorrencias'.
     */
    public void setQtdeOcorrencias(int qtdeOcorrencias)
    {
        this._qtdeOcorrencias = qtdeOcorrencias;
        this._has_qtdeOcorrencias = true;
    } //-- void setQtdeOcorrencias(int) 

    /**
     * Sets the value of field 'tipoAtualizacao'.
     * 
     * @param tipoAtualizacao the value of field 'tipoAtualizacao'.
     */
    public void setTipoAtualizacao(java.lang.String tipoAtualizacao)
    {
        this._tipoAtualizacao = tipoAtualizacao;
    } //-- void setTipoAtualizacao(java.lang.String) 

    /**
     * Sets the value of field 'valorJuros'.
     * 
     * @param valorJuros the value of field 'valorJuros'.
     */
    public void setValorJuros(java.math.BigDecimal valorJuros)
    {
        this._valorJuros = valorJuros;
    } //-- void setValorJuros(java.math.BigDecimal) 

    /**
     * Sets the value of field 'valorMulta'.
     * 
     * @param valorMulta the value of field 'valorMulta'.
     */
    public void setValorMulta(java.math.BigDecimal valorMulta)
    {
        this._valorMulta = valorMulta;
    } //-- void setValorMulta(java.math.BigDecimal) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return AgendarSelecionadosOuTodosRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.agendarselecionadosoutodos.request.AgendarSelecionadosOuTodosRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.agendarselecionadosoutodos.request.AgendarSelecionadosOuTodosRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.agendarselecionadosoutodos.request.AgendarSelecionadosOuTodosRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.agendarselecionadosoutodos.request.AgendarSelecionadosOuTodosRequest unmarshal(java.io.Reader) 

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
