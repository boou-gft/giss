/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ListarMunicipiosNovosAllResponse.java,v 1.1 2017/06/07 20:06:05 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listarmunicipiosnovosall.response;

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
 * Class ListarMunicipiosNovosAllResponse.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/06/07 20:06:05 $
 */
public class ListarMunicipiosNovosAllResponse implements java.io.Serializable {


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
     * Field _qtdeRegistros
     */
    private int _qtdeRegistros = 0;

    /**
     * keeps track of state for field: _qtdeRegistros
     */
    private boolean _has_qtdeRegistros;

    /**
     * Field _ocorrenciasMunicipioNovosList
     */
    private java.util.Vector _ocorrenciasMunicipioNovosList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarMunicipiosNovosAllResponse() 
     {
        super();
        _ocorrenciasMunicipioNovosList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarmunicipiosnovosall.response.ListarMunicipiosNovosAllResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addOcorrenciasMunicipioNovos
     * 
     * 
     * 
     * @param vOcorrenciasMunicipioNovos
     */
    public void addOcorrenciasMunicipioNovos(br.com.bradesco.web.giss.service.data.pdc.listarmunicipiosnovosall.response.OcorrenciasMunicipioNovos vOcorrenciasMunicipioNovos)
        throws java.lang.IndexOutOfBoundsException
    {
        _ocorrenciasMunicipioNovosList.addElement(vOcorrenciasMunicipioNovos);
    } //-- void addOcorrenciasMunicipioNovos(br.com.bradesco.web.giss.service.data.pdc.listarmunicipiosnovosall.response.OcorrenciasMunicipioNovos) 

    /**
     * Method addOcorrenciasMunicipioNovos
     * 
     * 
     * 
     * @param index
     * @param vOcorrenciasMunicipioNovos
     */
    public void addOcorrenciasMunicipioNovos(int index, br.com.bradesco.web.giss.service.data.pdc.listarmunicipiosnovosall.response.OcorrenciasMunicipioNovos vOcorrenciasMunicipioNovos)
        throws java.lang.IndexOutOfBoundsException
    {
        _ocorrenciasMunicipioNovosList.insertElementAt(vOcorrenciasMunicipioNovos, index);
    } //-- void addOcorrenciasMunicipioNovos(int, br.com.bradesco.web.giss.service.data.pdc.listarmunicipiosnovosall.response.OcorrenciasMunicipioNovos) 

    /**
     * Method deleteQtdeRegistros
     * 
     */
    public void deleteQtdeRegistros()
    {
        this._has_qtdeRegistros= false;
    } //-- void deleteQtdeRegistros() 

    /**
     * Method enumerateOcorrenciasMunicipioNovos
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateOcorrenciasMunicipioNovos()
    {
        return _ocorrenciasMunicipioNovosList.elements();
    } //-- java.util.Enumeration enumerateOcorrenciasMunicipioNovos() 

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
     * Method getOcorrenciasMunicipioNovos
     * 
     * 
     * 
     * @param index
     * @return OcorrenciasMunicipioNovos
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarmunicipiosnovosall.response.OcorrenciasMunicipioNovos getOcorrenciasMunicipioNovos(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _ocorrenciasMunicipioNovosList.size())) {
            throw new IndexOutOfBoundsException("getOcorrenciasMunicipioNovos: Index value '"+index+"' not in range [0.."+(_ocorrenciasMunicipioNovosList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.listarmunicipiosnovosall.response.OcorrenciasMunicipioNovos) _ocorrenciasMunicipioNovosList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarmunicipiosnovosall.response.OcorrenciasMunicipioNovos getOcorrenciasMunicipioNovos(int) 

    /**
     * Method getOcorrenciasMunicipioNovos
     * 
     * 
     * 
     * @return OcorrenciasMunicipioNovos
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarmunicipiosnovosall.response.OcorrenciasMunicipioNovos[] getOcorrenciasMunicipioNovos()
    {
        int size = _ocorrenciasMunicipioNovosList.size();
        br.com.bradesco.web.giss.service.data.pdc.listarmunicipiosnovosall.response.OcorrenciasMunicipioNovos[] mArray = new br.com.bradesco.web.giss.service.data.pdc.listarmunicipiosnovosall.response.OcorrenciasMunicipioNovos[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.listarmunicipiosnovosall.response.OcorrenciasMunicipioNovos) _ocorrenciasMunicipioNovosList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarmunicipiosnovosall.response.OcorrenciasMunicipioNovos[] getOcorrenciasMunicipioNovos() 

    /**
     * Method getOcorrenciasMunicipioNovosCount
     * 
     * 
     * 
     * @return int
     */
    public int getOcorrenciasMunicipioNovosCount()
    {
        return _ocorrenciasMunicipioNovosList.size();
    } //-- int getOcorrenciasMunicipioNovosCount() 

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
     * Method removeAllOcorrenciasMunicipioNovos
     * 
     */
    public void removeAllOcorrenciasMunicipioNovos()
    {
        _ocorrenciasMunicipioNovosList.removeAllElements();
    } //-- void removeAllOcorrenciasMunicipioNovos() 

    /**
     * Method removeOcorrenciasMunicipioNovos
     * 
     * 
     * 
     * @param index
     * @return OcorrenciasMunicipioNovos
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarmunicipiosnovosall.response.OcorrenciasMunicipioNovos removeOcorrenciasMunicipioNovos(int index)
    {
        java.lang.Object obj = _ocorrenciasMunicipioNovosList.elementAt(index);
        _ocorrenciasMunicipioNovosList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.listarmunicipiosnovosall.response.OcorrenciasMunicipioNovos) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarmunicipiosnovosall.response.OcorrenciasMunicipioNovos removeOcorrenciasMunicipioNovos(int) 

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
     * Sets the value of field 'mensagem'.
     * 
     * @param mensagem the value of field 'mensagem'.
     */
    public void setMensagem(java.lang.String mensagem)
    {
        this._mensagem = mensagem;
    } //-- void setMensagem(java.lang.String) 

    /**
     * Method setOcorrenciasMunicipioNovos
     * 
     * 
     * 
     * @param index
     * @param vOcorrenciasMunicipioNovos
     */
    public void setOcorrenciasMunicipioNovos(int index, br.com.bradesco.web.giss.service.data.pdc.listarmunicipiosnovosall.response.OcorrenciasMunicipioNovos vOcorrenciasMunicipioNovos)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _ocorrenciasMunicipioNovosList.size())) {
            throw new IndexOutOfBoundsException("setOcorrenciasMunicipioNovos: Index value '"+index+"' not in range [0.." + (_ocorrenciasMunicipioNovosList.size() - 1) + "]");
        }
        _ocorrenciasMunicipioNovosList.setElementAt(vOcorrenciasMunicipioNovos, index);
    } //-- void setOcorrenciasMunicipioNovos(int, br.com.bradesco.web.giss.service.data.pdc.listarmunicipiosnovosall.response.OcorrenciasMunicipioNovos) 

    /**
     * Method setOcorrenciasMunicipioNovos
     * 
     * 
     * 
     * @param ocorrenciasMunicipioNovosArray
     */
    public void setOcorrenciasMunicipioNovos(br.com.bradesco.web.giss.service.data.pdc.listarmunicipiosnovosall.response.OcorrenciasMunicipioNovos[] ocorrenciasMunicipioNovosArray)
    {
        //-- copy array
        _ocorrenciasMunicipioNovosList.removeAllElements();
        for (int i = 0; i < ocorrenciasMunicipioNovosArray.length; i++) {
            _ocorrenciasMunicipioNovosList.addElement(ocorrenciasMunicipioNovosArray[i]);
        }
    } //-- void setOcorrenciasMunicipioNovos(br.com.bradesco.web.giss.service.data.pdc.listarmunicipiosnovosall.response.OcorrenciasMunicipioNovos) 

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
     * @return ListarMunicipiosNovosAllResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarmunicipiosnovosall.response.ListarMunicipiosNovosAllResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarmunicipiosnovosall.response.ListarMunicipiosNovosAllResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarmunicipiosnovosall.response.ListarMunicipiosNovosAllResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarmunicipiosnovosall.response.ListarMunicipiosNovosAllResponse unmarshal(java.io.Reader) 

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
