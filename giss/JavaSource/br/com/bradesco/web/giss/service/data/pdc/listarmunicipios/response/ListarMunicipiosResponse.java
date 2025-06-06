/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ListarMunicipiosResponse.java,v 1.2 2017/12/18 10:46:15 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listarmunicipios.response;

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
 * Class ListarMunicipiosResponse.
 * 
 * @version $Revision: 1.2 $ $Date: 2017/12/18 10:46:15 $
 */
public class ListarMunicipiosResponse implements java.io.Serializable {


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
     * Field _qtdeReg
     */
    private int _qtdeReg = 0;

    /**
     * keeps track of state for field: _qtdeReg
     */
    private boolean _has_qtdeReg;

    /**
     * Field _ocorrenciasMunicipiosList
     */
    private java.util.Vector _ocorrenciasMunicipiosList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarMunicipiosResponse() 
     {
        super();
        _ocorrenciasMunicipiosList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarmunicipios.response.ListarMunicipiosResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addOcorrenciasMunicipios
     * 
     * 
     * 
     * @param vOcorrenciasMunicipios
     */
    public void addOcorrenciasMunicipios(br.com.bradesco.web.giss.service.data.pdc.listarmunicipios.response.OcorrenciasMunicipios vOcorrenciasMunicipios)
        throws java.lang.IndexOutOfBoundsException
    {
        _ocorrenciasMunicipiosList.addElement(vOcorrenciasMunicipios);
    } //-- void addOcorrenciasMunicipios(br.com.bradesco.web.giss.service.data.pdc.listarmunicipios.response.OcorrenciasMunicipios) 

    /**
     * Method addOcorrenciasMunicipios
     * 
     * 
     * 
     * @param index
     * @param vOcorrenciasMunicipios
     */
    public void addOcorrenciasMunicipios(int index, br.com.bradesco.web.giss.service.data.pdc.listarmunicipios.response.OcorrenciasMunicipios vOcorrenciasMunicipios)
        throws java.lang.IndexOutOfBoundsException
    {
        _ocorrenciasMunicipiosList.insertElementAt(vOcorrenciasMunicipios, index);
    } //-- void addOcorrenciasMunicipios(int, br.com.bradesco.web.giss.service.data.pdc.listarmunicipios.response.OcorrenciasMunicipios) 

    /**
     * Method deleteQtdeReg
     * 
     */
    public void deleteQtdeReg()
    {
        this._has_qtdeReg= false;
    } //-- void deleteQtdeReg() 

    /**
     * Method enumerateOcorrenciasMunicipios
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateOcorrenciasMunicipios()
    {
        return _ocorrenciasMunicipiosList.elements();
    } //-- java.util.Enumeration enumerateOcorrenciasMunicipios() 

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
     * Method getOcorrenciasMunicipios
     * 
     * 
     * 
     * @param index
     * @return OcorrenciasMunicipios
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarmunicipios.response.OcorrenciasMunicipios getOcorrenciasMunicipios(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _ocorrenciasMunicipiosList.size())) {
            throw new IndexOutOfBoundsException("getOcorrenciasMunicipios: Index value '"+index+"' not in range [0.."+(_ocorrenciasMunicipiosList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.listarmunicipios.response.OcorrenciasMunicipios) _ocorrenciasMunicipiosList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarmunicipios.response.OcorrenciasMunicipios getOcorrenciasMunicipios(int) 

    /**
     * Method getOcorrenciasMunicipios
     * 
     * 
     * 
     * @return OcorrenciasMunicipios
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarmunicipios.response.OcorrenciasMunicipios[] getOcorrenciasMunicipios()
    {
        int size = _ocorrenciasMunicipiosList.size();
        br.com.bradesco.web.giss.service.data.pdc.listarmunicipios.response.OcorrenciasMunicipios[] mArray = new br.com.bradesco.web.giss.service.data.pdc.listarmunicipios.response.OcorrenciasMunicipios[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.listarmunicipios.response.OcorrenciasMunicipios) _ocorrenciasMunicipiosList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarmunicipios.response.OcorrenciasMunicipios[] getOcorrenciasMunicipios() 

    /**
     * Method getOcorrenciasMunicipiosCount
     * 
     * 
     * 
     * @return int
     */
    public int getOcorrenciasMunicipiosCount()
    {
        return _ocorrenciasMunicipiosList.size();
    } //-- int getOcorrenciasMunicipiosCount() 

    /**
     * Returns the value of field 'qtdeReg'.
     * 
     * @return int
     * @return the value of field 'qtdeReg'.
     */
    public int getQtdeReg()
    {
        return this._qtdeReg;
    } //-- int getQtdeReg() 

    /**
     * Method hasQtdeReg
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasQtdeReg()
    {
        return this._has_qtdeReg;
    } //-- boolean hasQtdeReg() 

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
     * Method removeAllOcorrenciasMunicipios
     * 
     */
    public void removeAllOcorrenciasMunicipios()
    {
        _ocorrenciasMunicipiosList.removeAllElements();
    } //-- void removeAllOcorrenciasMunicipios() 

    /**
     * Method removeOcorrenciasMunicipios
     * 
     * 
     * 
     * @param index
     * @return OcorrenciasMunicipios
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarmunicipios.response.OcorrenciasMunicipios removeOcorrenciasMunicipios(int index)
    {
        java.lang.Object obj = _ocorrenciasMunicipiosList.elementAt(index);
        _ocorrenciasMunicipiosList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.listarmunicipios.response.OcorrenciasMunicipios) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarmunicipios.response.OcorrenciasMunicipios removeOcorrenciasMunicipios(int) 

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
     * Method setOcorrenciasMunicipios
     * 
     * 
     * 
     * @param index
     * @param vOcorrenciasMunicipios
     */
    public void setOcorrenciasMunicipios(int index, br.com.bradesco.web.giss.service.data.pdc.listarmunicipios.response.OcorrenciasMunicipios vOcorrenciasMunicipios)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _ocorrenciasMunicipiosList.size())) {
            throw new IndexOutOfBoundsException("setOcorrenciasMunicipios: Index value '"+index+"' not in range [0.." + (_ocorrenciasMunicipiosList.size() - 1) + "]");
        }
        _ocorrenciasMunicipiosList.setElementAt(vOcorrenciasMunicipios, index);
    } //-- void setOcorrenciasMunicipios(int, br.com.bradesco.web.giss.service.data.pdc.listarmunicipios.response.OcorrenciasMunicipios) 

    /**
     * Method setOcorrenciasMunicipios
     * 
     * 
     * 
     * @param ocorrenciasMunicipiosArray
     */
    public void setOcorrenciasMunicipios(br.com.bradesco.web.giss.service.data.pdc.listarmunicipios.response.OcorrenciasMunicipios[] ocorrenciasMunicipiosArray)
    {
        //-- copy array
        _ocorrenciasMunicipiosList.removeAllElements();
        for (int i = 0; i < ocorrenciasMunicipiosArray.length; i++) {
            _ocorrenciasMunicipiosList.addElement(ocorrenciasMunicipiosArray[i]);
        }
    } //-- void setOcorrenciasMunicipios(br.com.bradesco.web.giss.service.data.pdc.listarmunicipios.response.OcorrenciasMunicipios) 

    /**
     * Sets the value of field 'qtdeReg'.
     * 
     * @param qtdeReg the value of field 'qtdeReg'.
     */
    public void setQtdeReg(int qtdeReg)
    {
        this._qtdeReg = qtdeReg;
        this._has_qtdeReg = true;
    } //-- void setQtdeReg(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListarMunicipiosResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarmunicipios.response.ListarMunicipiosResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarmunicipios.response.ListarMunicipiosResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarmunicipios.response.ListarMunicipiosResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarmunicipios.response.ListarMunicipiosResponse unmarshal(java.io.Reader) 

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
