/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: GerarDependenciasPlanApuracaoRequest.java,v 1.1 2018/06/14 10:16:04 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.gerardependenciasplanapuracao.request;

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
 * Class GerarDependenciasPlanApuracaoRequest.
 * 
 * @version $Revision: 1.1 $ $Date: 2018/06/14 10:16:04 $
 */
public class GerarDependenciasPlanApuracaoRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _qtdeRegistros
     */
    private int _qtdeRegistros = 0;

    /**
     * keeps track of state for field: _qtdeRegistros
     */
    private boolean _has_qtdeRegistros;

    /**
     * Field _codMunicipio
     */
    private long _codMunicipio = 0;

    /**
     * keeps track of state for field: _codMunicipio
     */
    private boolean _has_codMunicipio;

    /**
     * Field _filtroConta
     */
    private java.lang.String _filtroConta;

    /**
     * Field _listaDepenPlanApuracaoNvContaList
     */
    private java.util.Vector _listaDepenPlanApuracaoNvContaList;


      //----------------/
     //- Constructors -/
    //----------------/

    public GerarDependenciasPlanApuracaoRequest() 
     {
        super();
        _listaDepenPlanApuracaoNvContaList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.gerardependenciasplanapuracao.request.GerarDependenciasPlanApuracaoRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addListaDepenPlanApuracaoNvConta
     * 
     * 
     * 
     * @param vListaDepenPlanApuracaoNvConta
     */
    public void addListaDepenPlanApuracaoNvConta(br.com.bradesco.web.giss.service.data.pdc.gerardependenciasplanapuracao.request.ListaDepenPlanApuracaoNvConta vListaDepenPlanApuracaoNvConta)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_listaDepenPlanApuracaoNvContaList.size() < 1000)) {
            throw new IndexOutOfBoundsException("addListaDepenPlanApuracaoNvConta has a maximum of 1000");
        }
        _listaDepenPlanApuracaoNvContaList.addElement(vListaDepenPlanApuracaoNvConta);
    } //-- void addListaDepenPlanApuracaoNvConta(br.com.bradesco.web.giss.service.data.pdc.gerardependenciasplanapuracao.request.ListaDepenPlanApuracaoNvConta) 

    /**
     * Method addListaDepenPlanApuracaoNvConta
     * 
     * 
     * 
     * @param index
     * @param vListaDepenPlanApuracaoNvConta
     */
    public void addListaDepenPlanApuracaoNvConta(int index, br.com.bradesco.web.giss.service.data.pdc.gerardependenciasplanapuracao.request.ListaDepenPlanApuracaoNvConta vListaDepenPlanApuracaoNvConta)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_listaDepenPlanApuracaoNvContaList.size() < 1000)) {
            throw new IndexOutOfBoundsException("addListaDepenPlanApuracaoNvConta has a maximum of 1000");
        }
        _listaDepenPlanApuracaoNvContaList.insertElementAt(vListaDepenPlanApuracaoNvConta, index);
    } //-- void addListaDepenPlanApuracaoNvConta(int, br.com.bradesco.web.giss.service.data.pdc.gerardependenciasplanapuracao.request.ListaDepenPlanApuracaoNvConta) 

    /**
     * Method deleteCodMunicipio
     * 
     */
    public void deleteCodMunicipio()
    {
        this._has_codMunicipio= false;
    } //-- void deleteCodMunicipio() 

    /**
     * Method deleteQtdeRegistros
     * 
     */
    public void deleteQtdeRegistros()
    {
        this._has_qtdeRegistros= false;
    } //-- void deleteQtdeRegistros() 

    /**
     * Method enumerateListaDepenPlanApuracaoNvConta
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateListaDepenPlanApuracaoNvConta()
    {
        return _listaDepenPlanApuracaoNvContaList.elements();
    } //-- java.util.Enumeration enumerateListaDepenPlanApuracaoNvConta() 

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
     * Returns the value of field 'filtroConta'.
     * 
     * @return String
     * @return the value of field 'filtroConta'.
     */
    public java.lang.String getFiltroConta()
    {
        return this._filtroConta;
    } //-- java.lang.String getFiltroConta() 

    /**
     * Method getListaDepenPlanApuracaoNvConta
     * 
     * 
     * 
     * @param index
     * @return ListaDepenPlanApuracaoNvConta
     */
    public br.com.bradesco.web.giss.service.data.pdc.gerardependenciasplanapuracao.request.ListaDepenPlanApuracaoNvConta getListaDepenPlanApuracaoNvConta(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaDepenPlanApuracaoNvContaList.size())) {
            throw new IndexOutOfBoundsException("getListaDepenPlanApuracaoNvConta: Index value '"+index+"' not in range [0.."+(_listaDepenPlanApuracaoNvContaList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.gerardependenciasplanapuracao.request.ListaDepenPlanApuracaoNvConta) _listaDepenPlanApuracaoNvContaList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.gerardependenciasplanapuracao.request.ListaDepenPlanApuracaoNvConta getListaDepenPlanApuracaoNvConta(int) 

    /**
     * Method getListaDepenPlanApuracaoNvConta
     * 
     * 
     * 
     * @return ListaDepenPlanApuracaoNvConta
     */
    public br.com.bradesco.web.giss.service.data.pdc.gerardependenciasplanapuracao.request.ListaDepenPlanApuracaoNvConta[] getListaDepenPlanApuracaoNvConta()
    {
        int size = _listaDepenPlanApuracaoNvContaList.size();
        br.com.bradesco.web.giss.service.data.pdc.gerardependenciasplanapuracao.request.ListaDepenPlanApuracaoNvConta[] mArray = new br.com.bradesco.web.giss.service.data.pdc.gerardependenciasplanapuracao.request.ListaDepenPlanApuracaoNvConta[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.gerardependenciasplanapuracao.request.ListaDepenPlanApuracaoNvConta) _listaDepenPlanApuracaoNvContaList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.gerardependenciasplanapuracao.request.ListaDepenPlanApuracaoNvConta[] getListaDepenPlanApuracaoNvConta() 

    /**
     * Method getListaDepenPlanApuracaoNvContaCount
     * 
     * 
     * 
     * @return int
     */
    public int getListaDepenPlanApuracaoNvContaCount()
    {
        return _listaDepenPlanApuracaoNvContaList.size();
    } //-- int getListaDepenPlanApuracaoNvContaCount() 

    /**
     * Returns the value of field 'qtdeRegistros'.
     * 
     * @return int
     * @return the value of field 'qtdeRegistros'.
     */
    public int getQtdeRegistros()
    {
        return this._qtdeRegistros;
    } //-- int getQtdeRegistros() 

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
     * Method hasQtdeRegistros
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasQtdeRegistros()
    {
        return this._has_qtdeRegistros;
    } //-- boolean hasQtdeRegistros() 

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
     * Method removeAllListaDepenPlanApuracaoNvConta
     * 
     */
    public void removeAllListaDepenPlanApuracaoNvConta()
    {
        _listaDepenPlanApuracaoNvContaList.removeAllElements();
    } //-- void removeAllListaDepenPlanApuracaoNvConta() 

    /**
     * Method removeListaDepenPlanApuracaoNvConta
     * 
     * 
     * 
     * @param index
     * @return ListaDepenPlanApuracaoNvConta
     */
    public br.com.bradesco.web.giss.service.data.pdc.gerardependenciasplanapuracao.request.ListaDepenPlanApuracaoNvConta removeListaDepenPlanApuracaoNvConta(int index)
    {
        java.lang.Object obj = _listaDepenPlanApuracaoNvContaList.elementAt(index);
        _listaDepenPlanApuracaoNvContaList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.gerardependenciasplanapuracao.request.ListaDepenPlanApuracaoNvConta) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.gerardependenciasplanapuracao.request.ListaDepenPlanApuracaoNvConta removeListaDepenPlanApuracaoNvConta(int) 

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
     * Sets the value of field 'filtroConta'.
     * 
     * @param filtroConta the value of field 'filtroConta'.
     */
    public void setFiltroConta(java.lang.String filtroConta)
    {
        this._filtroConta = filtroConta;
    } //-- void setFiltroConta(java.lang.String) 

    /**
     * Method setListaDepenPlanApuracaoNvConta
     * 
     * 
     * 
     * @param index
     * @param vListaDepenPlanApuracaoNvConta
     */
    public void setListaDepenPlanApuracaoNvConta(int index, br.com.bradesco.web.giss.service.data.pdc.gerardependenciasplanapuracao.request.ListaDepenPlanApuracaoNvConta vListaDepenPlanApuracaoNvConta)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaDepenPlanApuracaoNvContaList.size())) {
            throw new IndexOutOfBoundsException("setListaDepenPlanApuracaoNvConta: Index value '"+index+"' not in range [0.." + (_listaDepenPlanApuracaoNvContaList.size() - 1) + "]");
        }
        if (!(index < 1000)) {
            throw new IndexOutOfBoundsException("setListaDepenPlanApuracaoNvConta has a maximum of 1000");
        }
        _listaDepenPlanApuracaoNvContaList.setElementAt(vListaDepenPlanApuracaoNvConta, index);
    } //-- void setListaDepenPlanApuracaoNvConta(int, br.com.bradesco.web.giss.service.data.pdc.gerardependenciasplanapuracao.request.ListaDepenPlanApuracaoNvConta) 

    /**
     * Method setListaDepenPlanApuracaoNvConta
     * 
     * 
     * 
     * @param listaDepenPlanApuracaoNvContaArray
     */
    public void setListaDepenPlanApuracaoNvConta(br.com.bradesco.web.giss.service.data.pdc.gerardependenciasplanapuracao.request.ListaDepenPlanApuracaoNvConta[] listaDepenPlanApuracaoNvContaArray)
    {
        //-- copy array
        _listaDepenPlanApuracaoNvContaList.removeAllElements();
        for (int i = 0; i < listaDepenPlanApuracaoNvContaArray.length; i++) {
            _listaDepenPlanApuracaoNvContaList.addElement(listaDepenPlanApuracaoNvContaArray[i]);
        }
    } //-- void setListaDepenPlanApuracaoNvConta(br.com.bradesco.web.giss.service.data.pdc.gerardependenciasplanapuracao.request.ListaDepenPlanApuracaoNvConta) 

    /**
     * Sets the value of field 'qtdeRegistros'.
     * 
     * @param qtdeRegistros the value of field 'qtdeRegistros'.
     */
    public void setQtdeRegistros(int qtdeRegistros)
    {
        this._qtdeRegistros = qtdeRegistros;
        this._has_qtdeRegistros = true;
    } //-- void setQtdeRegistros(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return GerarDependenciasPlanApuracaoRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.gerardependenciasplanapuracao.request.GerarDependenciasPlanApuracaoRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.gerardependenciasplanapuracao.request.GerarDependenciasPlanApuracaoRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.gerardependenciasplanapuracao.request.GerarDependenciasPlanApuracaoRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.gerardependenciasplanapuracao.request.GerarDependenciasPlanApuracaoRequest unmarshal(java.io.Reader) 

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
