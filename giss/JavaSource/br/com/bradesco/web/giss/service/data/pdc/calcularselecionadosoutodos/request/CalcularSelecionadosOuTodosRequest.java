/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.calcularselecionadosoutodos.request;

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
 * Class CalcularSelecionadosOuTodosRequest.
 * 
 * @version $Revision$ $Date$
 */
public class CalcularSelecionadosOuTodosRequest implements java.io.Serializable {


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
     * Field _percentualAtualizacaoMonetearia
     */
    private double _percentualAtualizacaoMonetearia = 0;

    /**
     * keeps track of state for field:
     * _percentualAtualizacaoMonetearia
     */
    private boolean _has_percentualAtualizacaoMonetearia;

    /**
     * Field _calcularTodos
     */
    private java.lang.String _calcularTodos;

    /**
     * Field _listaMunicipiosCalcularList
     */
    private java.util.Vector _listaMunicipiosCalcularList;


      //----------------/
     //- Constructors -/
    //----------------/

    public CalcularSelecionadosOuTodosRequest() 
     {
        super();
        setValorMulta(new java.math.BigDecimal("0"));
        _listaMunicipiosCalcularList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.calcularselecionadosoutodos.request.CalcularSelecionadosOuTodosRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addListaMunicipiosCalcular
     * 
     * 
     * 
     * @param vListaMunicipiosCalcular
     */
    public void addListaMunicipiosCalcular(br.com.bradesco.web.giss.service.data.pdc.calcularselecionadosoutodos.request.ListaMunicipiosCalcular vListaMunicipiosCalcular)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_listaMunicipiosCalcularList.size() < 70)) {
            throw new IndexOutOfBoundsException("addListaMunicipiosCalcular has a maximum of 70");
        }
        _listaMunicipiosCalcularList.addElement(vListaMunicipiosCalcular);
    } //-- void addListaMunicipiosCalcular(br.com.bradesco.web.giss.service.data.pdc.calcularselecionadosoutodos.request.ListaMunicipiosCalcular) 

    /**
     * Method addListaMunicipiosCalcular
     * 
     * 
     * 
     * @param index
     * @param vListaMunicipiosCalcular
     */
    public void addListaMunicipiosCalcular(int index, br.com.bradesco.web.giss.service.data.pdc.calcularselecionadosoutodos.request.ListaMunicipiosCalcular vListaMunicipiosCalcular)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_listaMunicipiosCalcularList.size() < 70)) {
            throw new IndexOutOfBoundsException("addListaMunicipiosCalcular has a maximum of 70");
        }
        _listaMunicipiosCalcularList.insertElementAt(vListaMunicipiosCalcular, index);
    } //-- void addListaMunicipiosCalcular(int, br.com.bradesco.web.giss.service.data.pdc.calcularselecionadosoutodos.request.ListaMunicipiosCalcular) 

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
     * Method deletePercentualAtualizacaoMonetearia
     * 
     */
    public void deletePercentualAtualizacaoMonetearia()
    {
        this._has_percentualAtualizacaoMonetearia= false;
    } //-- void deletePercentualAtualizacaoMonetearia() 

    /**
     * Method enumerateListaMunicipiosCalcular
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateListaMunicipiosCalcular()
    {
        return _listaMunicipiosCalcularList.elements();
    } //-- java.util.Enumeration enumerateListaMunicipiosCalcular() 

    /**
     * Returns the value of field 'calcularTodos'.
     * 
     * @return String
     * @return the value of field 'calcularTodos'.
     */
    public java.lang.String getCalcularTodos()
    {
        return this._calcularTodos;
    } //-- java.lang.String getCalcularTodos() 

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
     * Method getListaMunicipiosCalcular
     * 
     * 
     * 
     * @param index
     * @return ListaMunicipiosCalcular
     */
    public br.com.bradesco.web.giss.service.data.pdc.calcularselecionadosoutodos.request.ListaMunicipiosCalcular getListaMunicipiosCalcular(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaMunicipiosCalcularList.size())) {
            throw new IndexOutOfBoundsException("getListaMunicipiosCalcular: Index value '"+index+"' not in range [0.."+(_listaMunicipiosCalcularList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.calcularselecionadosoutodos.request.ListaMunicipiosCalcular) _listaMunicipiosCalcularList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.calcularselecionadosoutodos.request.ListaMunicipiosCalcular getListaMunicipiosCalcular(int) 

    /**
     * Method getListaMunicipiosCalcular
     * 
     * 
     * 
     * @return ListaMunicipiosCalcular
     */
    public br.com.bradesco.web.giss.service.data.pdc.calcularselecionadosoutodos.request.ListaMunicipiosCalcular[] getListaMunicipiosCalcular()
    {
        int size = _listaMunicipiosCalcularList.size();
        br.com.bradesco.web.giss.service.data.pdc.calcularselecionadosoutodos.request.ListaMunicipiosCalcular[] mArray = new br.com.bradesco.web.giss.service.data.pdc.calcularselecionadosoutodos.request.ListaMunicipiosCalcular[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.calcularselecionadosoutodos.request.ListaMunicipiosCalcular) _listaMunicipiosCalcularList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.calcularselecionadosoutodos.request.ListaMunicipiosCalcular[] getListaMunicipiosCalcular() 

    /**
     * Method getListaMunicipiosCalcularCount
     * 
     * 
     * 
     * @return int
     */
    public int getListaMunicipiosCalcularCount()
    {
        return _listaMunicipiosCalcularList.size();
    } //-- int getListaMunicipiosCalcularCount() 

    /**
     * Returns the value of field
     * 'percentualAtualizacaoMonetearia'.
     * 
     * @return double
     * @return the value of field 'percentualAtualizacaoMonetearia'.
     */
    public double getPercentualAtualizacaoMonetearia()
    {
        return this._percentualAtualizacaoMonetearia;
    } //-- double getPercentualAtualizacaoMonetearia() 

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
     * Method hasPercentualAtualizacaoMonetearia
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasPercentualAtualizacaoMonetearia()
    {
        return this._has_percentualAtualizacaoMonetearia;
    } //-- boolean hasPercentualAtualizacaoMonetearia() 

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
     * Method removeAllListaMunicipiosCalcular
     * 
     */
    public void removeAllListaMunicipiosCalcular()
    {
        _listaMunicipiosCalcularList.removeAllElements();
    } //-- void removeAllListaMunicipiosCalcular() 

    /**
     * Method removeListaMunicipiosCalcular
     * 
     * 
     * 
     * @param index
     * @return ListaMunicipiosCalcular
     */
    public br.com.bradesco.web.giss.service.data.pdc.calcularselecionadosoutodos.request.ListaMunicipiosCalcular removeListaMunicipiosCalcular(int index)
    {
        java.lang.Object obj = _listaMunicipiosCalcularList.elementAt(index);
        _listaMunicipiosCalcularList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.calcularselecionadosoutodos.request.ListaMunicipiosCalcular) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.calcularselecionadosoutodos.request.ListaMunicipiosCalcular removeListaMunicipiosCalcular(int) 

    /**
     * Sets the value of field 'calcularTodos'.
     * 
     * @param calcularTodos the value of field 'calcularTodos'.
     */
    public void setCalcularTodos(java.lang.String calcularTodos)
    {
        this._calcularTodos = calcularTodos;
    } //-- void setCalcularTodos(java.lang.String) 

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
     * Method setListaMunicipiosCalcular
     * 
     * 
     * 
     * @param index
     * @param vListaMunicipiosCalcular
     */
    public void setListaMunicipiosCalcular(int index, br.com.bradesco.web.giss.service.data.pdc.calcularselecionadosoutodos.request.ListaMunicipiosCalcular vListaMunicipiosCalcular)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaMunicipiosCalcularList.size())) {
            throw new IndexOutOfBoundsException("setListaMunicipiosCalcular: Index value '"+index+"' not in range [0.." + (_listaMunicipiosCalcularList.size() - 1) + "]");
        }
        if (!(index < 70)) {
            throw new IndexOutOfBoundsException("setListaMunicipiosCalcular has a maximum of 70");
        }
        _listaMunicipiosCalcularList.setElementAt(vListaMunicipiosCalcular, index);
    } //-- void setListaMunicipiosCalcular(int, br.com.bradesco.web.giss.service.data.pdc.calcularselecionadosoutodos.request.ListaMunicipiosCalcular) 

    /**
     * Method setListaMunicipiosCalcular
     * 
     * 
     * 
     * @param listaMunicipiosCalcularArray
     */
    public void setListaMunicipiosCalcular(br.com.bradesco.web.giss.service.data.pdc.calcularselecionadosoutodos.request.ListaMunicipiosCalcular[] listaMunicipiosCalcularArray)
    {
        //-- copy array
        _listaMunicipiosCalcularList.removeAllElements();
        for (int i = 0; i < listaMunicipiosCalcularArray.length; i++) {
            _listaMunicipiosCalcularList.addElement(listaMunicipiosCalcularArray[i]);
        }
    } //-- void setListaMunicipiosCalcular(br.com.bradesco.web.giss.service.data.pdc.calcularselecionadosoutodos.request.ListaMunicipiosCalcular) 

    /**
     * Sets the value of field 'percentualAtualizacaoMonetearia'.
     * 
     * @param percentualAtualizacaoMonetearia the value of field
     * 'percentualAtualizacaoMonetearia'.
     */
    public void setPercentualAtualizacaoMonetearia(double percentualAtualizacaoMonetearia)
    {
        this._percentualAtualizacaoMonetearia = percentualAtualizacaoMonetearia;
        this._has_percentualAtualizacaoMonetearia = true;
    } //-- void setPercentualAtualizacaoMonetearia(double) 

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
     * @return CalcularSelecionadosOuTodosRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.calcularselecionadosoutodos.request.CalcularSelecionadosOuTodosRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.calcularselecionadosoutodos.request.CalcularSelecionadosOuTodosRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.calcularselecionadosoutodos.request.CalcularSelecionadosOuTodosRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.calcularselecionadosoutodos.request.CalcularSelecionadosOuTodosRequest unmarshal(java.io.Reader) 

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
