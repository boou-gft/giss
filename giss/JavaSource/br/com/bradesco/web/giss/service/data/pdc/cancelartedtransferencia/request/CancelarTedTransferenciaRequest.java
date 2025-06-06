/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.cancelartedtransferencia.request;

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
 * Class CancelarTedTransferenciaRequest.
 * 
 * @version $Revision$ $Date$
 */
public class CancelarTedTransferenciaRequest implements java.io.Serializable {


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
     * Field _produto
     */
    private int _produto = 0;

    /**
     * keeps track of state for field: _produto
     */
    private boolean _has_produto;

    /**
     * Field _cancelarTodos
     */
    private java.lang.String _cancelarTodos;

    /**
     * Field _listaMunicipiosList
     */
    private java.util.Vector _listaMunicipiosList;


      //----------------/
     //- Constructors -/
    //----------------/

    public CancelarTedTransferenciaRequest() 
     {
        super();
        _listaMunicipiosList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.cancelartedtransferencia.request.CancelarTedTransferenciaRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addListaMunicipios
     * 
     * 
     * 
     * @param vListaMunicipios
     */
    public void addListaMunicipios(br.com.bradesco.web.giss.service.data.pdc.cancelartedtransferencia.request.ListaMunicipios vListaMunicipios)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_listaMunicipiosList.size() < 500)) {
            throw new IndexOutOfBoundsException("addListaMunicipios has a maximum of 500");
        }
        _listaMunicipiosList.addElement(vListaMunicipios);
    } //-- void addListaMunicipios(br.com.bradesco.web.giss.service.data.pdc.cancelartedtransferencia.request.ListaMunicipios) 

    /**
     * Method addListaMunicipios
     * 
     * 
     * 
     * @param index
     * @param vListaMunicipios
     */
    public void addListaMunicipios(int index, br.com.bradesco.web.giss.service.data.pdc.cancelartedtransferencia.request.ListaMunicipios vListaMunicipios)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_listaMunicipiosList.size() < 500)) {
            throw new IndexOutOfBoundsException("addListaMunicipios has a maximum of 500");
        }
        _listaMunicipiosList.insertElementAt(vListaMunicipios, index);
    } //-- void addListaMunicipios(int, br.com.bradesco.web.giss.service.data.pdc.cancelartedtransferencia.request.ListaMunicipios) 

    /**
     * Method deleteCodEmpresa
     * 
     */
    public void deleteCodEmpresa()
    {
        this._has_codEmpresa= false;
    } //-- void deleteCodEmpresa() 

    /**
     * Method deleteCompetencia
     * 
     */
    public void deleteCompetencia()
    {
        this._has_competencia= false;
    } //-- void deleteCompetencia() 

    /**
     * Method deleteProduto
     * 
     */
    public void deleteProduto()
    {
        this._has_produto= false;
    } //-- void deleteProduto() 

    /**
     * Method enumerateListaMunicipios
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateListaMunicipios()
    {
        return _listaMunicipiosList.elements();
    } //-- java.util.Enumeration enumerateListaMunicipios() 

    /**
     * Returns the value of field 'cancelarTodos'.
     * 
     * @return String
     * @return the value of field 'cancelarTodos'.
     */
    public java.lang.String getCancelarTodos()
    {
        return this._cancelarTodos;
    } //-- java.lang.String getCancelarTodos() 

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
     * Method getListaMunicipios
     * 
     * 
     * 
     * @param index
     * @return ListaMunicipios
     */
    public br.com.bradesco.web.giss.service.data.pdc.cancelartedtransferencia.request.ListaMunicipios getListaMunicipios(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaMunicipiosList.size())) {
            throw new IndexOutOfBoundsException("getListaMunicipios: Index value '"+index+"' not in range [0.."+(_listaMunicipiosList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.cancelartedtransferencia.request.ListaMunicipios) _listaMunicipiosList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.cancelartedtransferencia.request.ListaMunicipios getListaMunicipios(int) 

    /**
     * Method getListaMunicipios
     * 
     * 
     * 
     * @return ListaMunicipios
     */
    public br.com.bradesco.web.giss.service.data.pdc.cancelartedtransferencia.request.ListaMunicipios[] getListaMunicipios()
    {
        int size = _listaMunicipiosList.size();
        br.com.bradesco.web.giss.service.data.pdc.cancelartedtransferencia.request.ListaMunicipios[] mArray = new br.com.bradesco.web.giss.service.data.pdc.cancelartedtransferencia.request.ListaMunicipios[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.cancelartedtransferencia.request.ListaMunicipios) _listaMunicipiosList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.cancelartedtransferencia.request.ListaMunicipios[] getListaMunicipios() 

    /**
     * Method getListaMunicipiosCount
     * 
     * 
     * 
     * @return int
     */
    public int getListaMunicipiosCount()
    {
        return _listaMunicipiosList.size();
    } //-- int getListaMunicipiosCount() 

    /**
     * Returns the value of field 'produto'.
     * 
     * @return int
     * @return the value of field 'produto'.
     */
    public int getProduto()
    {
        return this._produto;
    } //-- int getProduto() 

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
     * Method hasProduto
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasProduto()
    {
        return this._has_produto;
    } //-- boolean hasProduto() 

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
     * Method removeAllListaMunicipios
     * 
     */
    public void removeAllListaMunicipios()
    {
        _listaMunicipiosList.removeAllElements();
    } //-- void removeAllListaMunicipios() 

    /**
     * Method removeListaMunicipios
     * 
     * 
     * 
     * @param index
     * @return ListaMunicipios
     */
    public br.com.bradesco.web.giss.service.data.pdc.cancelartedtransferencia.request.ListaMunicipios removeListaMunicipios(int index)
    {
        java.lang.Object obj = _listaMunicipiosList.elementAt(index);
        _listaMunicipiosList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.cancelartedtransferencia.request.ListaMunicipios) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.cancelartedtransferencia.request.ListaMunicipios removeListaMunicipios(int) 

    /**
     * Sets the value of field 'cancelarTodos'.
     * 
     * @param cancelarTodos the value of field 'cancelarTodos'.
     */
    public void setCancelarTodos(java.lang.String cancelarTodos)
    {
        this._cancelarTodos = cancelarTodos;
    } //-- void setCancelarTodos(java.lang.String) 

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
     * Method setListaMunicipios
     * 
     * 
     * 
     * @param index
     * @param vListaMunicipios
     */
    public void setListaMunicipios(int index, br.com.bradesco.web.giss.service.data.pdc.cancelartedtransferencia.request.ListaMunicipios vListaMunicipios)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaMunicipiosList.size())) {
            throw new IndexOutOfBoundsException("setListaMunicipios: Index value '"+index+"' not in range [0.." + (_listaMunicipiosList.size() - 1) + "]");
        }
        if (!(index < 500)) {
            throw new IndexOutOfBoundsException("setListaMunicipios has a maximum of 500");
        }
        _listaMunicipiosList.setElementAt(vListaMunicipios, index);
    } //-- void setListaMunicipios(int, br.com.bradesco.web.giss.service.data.pdc.cancelartedtransferencia.request.ListaMunicipios) 

    /**
     * Method setListaMunicipios
     * 
     * 
     * 
     * @param listaMunicipiosArray
     */
    public void setListaMunicipios(br.com.bradesco.web.giss.service.data.pdc.cancelartedtransferencia.request.ListaMunicipios[] listaMunicipiosArray)
    {
        //-- copy array
        _listaMunicipiosList.removeAllElements();
        for (int i = 0; i < listaMunicipiosArray.length; i++) {
            _listaMunicipiosList.addElement(listaMunicipiosArray[i]);
        }
    } //-- void setListaMunicipios(br.com.bradesco.web.giss.service.data.pdc.cancelartedtransferencia.request.ListaMunicipios) 

    /**
     * Sets the value of field 'produto'.
     * 
     * @param produto the value of field 'produto'.
     */
    public void setProduto(int produto)
    {
        this._produto = produto;
        this._has_produto = true;
    } //-- void setProduto(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return CancelarTedTransferenciaRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.cancelartedtransferencia.request.CancelarTedTransferenciaRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.cancelartedtransferencia.request.CancelarTedTransferenciaRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.cancelartedtransferencia.request.CancelarTedTransferenciaRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.cancelartedtransferencia.request.CancelarTedTransferenciaRequest unmarshal(java.io.Reader) 

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
