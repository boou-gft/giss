/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.agendarpgtoindividual.request;

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
 * Class AgendarPgtoIndividualRequest.
 * 
 * @version $Revision$ $Date$
 */
public class AgendarPgtoIndividualRequest implements java.io.Serializable {


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
     * Field _listaMunicipioAgendarList
     */
    private java.util.Vector _listaMunicipioAgendarList;


      //----------------/
     //- Constructors -/
    //----------------/

    public AgendarPgtoIndividualRequest() 
     {
        super();
        _listaMunicipioAgendarList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.agendarpgtoindividual.request.AgendarPgtoIndividualRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addListaMunicipioAgendar
     * 
     * 
     * 
     * @param vListaMunicipioAgendar
     */
    public void addListaMunicipioAgendar(br.com.bradesco.web.giss.service.data.pdc.agendarpgtoindividual.request.ListaMunicipioAgendar vListaMunicipioAgendar)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_listaMunicipioAgendarList.size() < 200)) {
            throw new IndexOutOfBoundsException("addListaMunicipioAgendar has a maximum of 200");
        }
        _listaMunicipioAgendarList.addElement(vListaMunicipioAgendar);
    } //-- void addListaMunicipioAgendar(br.com.bradesco.web.giss.service.data.pdc.agendarpgtoindividual.request.ListaMunicipioAgendar) 

    /**
     * Method addListaMunicipioAgendar
     * 
     * 
     * 
     * @param index
     * @param vListaMunicipioAgendar
     */
    public void addListaMunicipioAgendar(int index, br.com.bradesco.web.giss.service.data.pdc.agendarpgtoindividual.request.ListaMunicipioAgendar vListaMunicipioAgendar)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_listaMunicipioAgendarList.size() < 200)) {
            throw new IndexOutOfBoundsException("addListaMunicipioAgendar has a maximum of 200");
        }
        _listaMunicipioAgendarList.insertElementAt(vListaMunicipioAgendar, index);
    } //-- void addListaMunicipioAgendar(int, br.com.bradesco.web.giss.service.data.pdc.agendarpgtoindividual.request.ListaMunicipioAgendar) 

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
     * Method enumerateListaMunicipioAgendar
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateListaMunicipioAgendar()
    {
        return _listaMunicipioAgendarList.elements();
    } //-- java.util.Enumeration enumerateListaMunicipioAgendar() 

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
     * Method getListaMunicipioAgendar
     * 
     * 
     * 
     * @param index
     * @return ListaMunicipioAgendar
     */
    public br.com.bradesco.web.giss.service.data.pdc.agendarpgtoindividual.request.ListaMunicipioAgendar getListaMunicipioAgendar(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaMunicipioAgendarList.size())) {
            throw new IndexOutOfBoundsException("getListaMunicipioAgendar: Index value '"+index+"' not in range [0.."+(_listaMunicipioAgendarList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.agendarpgtoindividual.request.ListaMunicipioAgendar) _listaMunicipioAgendarList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.agendarpgtoindividual.request.ListaMunicipioAgendar getListaMunicipioAgendar(int) 

    /**
     * Method getListaMunicipioAgendar
     * 
     * 
     * 
     * @return ListaMunicipioAgendar
     */
    public br.com.bradesco.web.giss.service.data.pdc.agendarpgtoindividual.request.ListaMunicipioAgendar[] getListaMunicipioAgendar()
    {
        int size = _listaMunicipioAgendarList.size();
        br.com.bradesco.web.giss.service.data.pdc.agendarpgtoindividual.request.ListaMunicipioAgendar[] mArray = new br.com.bradesco.web.giss.service.data.pdc.agendarpgtoindividual.request.ListaMunicipioAgendar[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.agendarpgtoindividual.request.ListaMunicipioAgendar) _listaMunicipioAgendarList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.agendarpgtoindividual.request.ListaMunicipioAgendar[] getListaMunicipioAgendar() 

    /**
     * Method getListaMunicipioAgendarCount
     * 
     * 
     * 
     * @return int
     */
    public int getListaMunicipioAgendarCount()
    {
        return _listaMunicipioAgendarList.size();
    } //-- int getListaMunicipioAgendarCount() 

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
     * Method removeAllListaMunicipioAgendar
     * 
     */
    public void removeAllListaMunicipioAgendar()
    {
        _listaMunicipioAgendarList.removeAllElements();
    } //-- void removeAllListaMunicipioAgendar() 

    /**
     * Method removeListaMunicipioAgendar
     * 
     * 
     * 
     * @param index
     * @return ListaMunicipioAgendar
     */
    public br.com.bradesco.web.giss.service.data.pdc.agendarpgtoindividual.request.ListaMunicipioAgendar removeListaMunicipioAgendar(int index)
    {
        java.lang.Object obj = _listaMunicipioAgendarList.elementAt(index);
        _listaMunicipioAgendarList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.agendarpgtoindividual.request.ListaMunicipioAgendar) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.agendarpgtoindividual.request.ListaMunicipioAgendar removeListaMunicipioAgendar(int) 

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
     * Method setListaMunicipioAgendar
     * 
     * 
     * 
     * @param index
     * @param vListaMunicipioAgendar
     */
    public void setListaMunicipioAgendar(int index, br.com.bradesco.web.giss.service.data.pdc.agendarpgtoindividual.request.ListaMunicipioAgendar vListaMunicipioAgendar)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaMunicipioAgendarList.size())) {
            throw new IndexOutOfBoundsException("setListaMunicipioAgendar: Index value '"+index+"' not in range [0.." + (_listaMunicipioAgendarList.size() - 1) + "]");
        }
        if (!(index < 200)) {
            throw new IndexOutOfBoundsException("setListaMunicipioAgendar has a maximum of 200");
        }
        _listaMunicipioAgendarList.setElementAt(vListaMunicipioAgendar, index);
    } //-- void setListaMunicipioAgendar(int, br.com.bradesco.web.giss.service.data.pdc.agendarpgtoindividual.request.ListaMunicipioAgendar) 

    /**
     * Method setListaMunicipioAgendar
     * 
     * 
     * 
     * @param listaMunicipioAgendarArray
     */
    public void setListaMunicipioAgendar(br.com.bradesco.web.giss.service.data.pdc.agendarpgtoindividual.request.ListaMunicipioAgendar[] listaMunicipioAgendarArray)
    {
        //-- copy array
        _listaMunicipioAgendarList.removeAllElements();
        for (int i = 0; i < listaMunicipioAgendarArray.length; i++) {
            _listaMunicipioAgendarList.addElement(listaMunicipioAgendarArray[i]);
        }
    } //-- void setListaMunicipioAgendar(br.com.bradesco.web.giss.service.data.pdc.agendarpgtoindividual.request.ListaMunicipioAgendar) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return AgendarPgtoIndividualRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.agendarpgtoindividual.request.AgendarPgtoIndividualRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.agendarpgtoindividual.request.AgendarPgtoIndividualRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.agendarpgtoindividual.request.AgendarPgtoIndividualRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.agendarpgtoindividual.request.AgendarPgtoIndividualRequest unmarshal(java.io.Reader) 

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
