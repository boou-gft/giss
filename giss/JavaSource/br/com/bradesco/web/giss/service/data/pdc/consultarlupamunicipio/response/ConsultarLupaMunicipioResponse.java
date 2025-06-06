/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ConsultarLupaMunicipioResponse.java,v 1.2 2017/12/08 17:29:22 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.consultarlupamunicipio.response;

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
 * Class ConsultarLupaMunicipioResponse.
 * 
 * @version $Revision: 1.2 $ $Date: 2017/12/08 17:29:22 $
 */
public class ConsultarLupaMunicipioResponse implements java.io.Serializable {


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
     * Field _quantOcorrencia
     */
    private int _quantOcorrencia = 0;

    /**
     * keeps track of state for field: _quantOcorrencia
     */
    private boolean _has_quantOcorrencia;

    /**
     * Field _codPaisIrecp
     */
    private java.lang.String _codPaisIrecp;

    /**
     * Field _pais
     */
    private java.lang.String _pais;

    /**
     * Field _listaConsultarLupaMunicipioList
     */
    private java.util.Vector _listaConsultarLupaMunicipioList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ConsultarLupaMunicipioResponse() 
     {
        super();
        _listaConsultarLupaMunicipioList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultarlupamunicipio.response.ConsultarLupaMunicipioResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addListaConsultarLupaMunicipio
     * 
     * 
     * 
     * @param vListaConsultarLupaMunicipio
     */
    public void addListaConsultarLupaMunicipio(br.com.bradesco.web.giss.service.data.pdc.consultarlupamunicipio.response.ListaConsultarLupaMunicipio vListaConsultarLupaMunicipio)
        throws java.lang.IndexOutOfBoundsException
    {
        _listaConsultarLupaMunicipioList.addElement(vListaConsultarLupaMunicipio);
    } //-- void addListaConsultarLupaMunicipio(br.com.bradesco.web.giss.service.data.pdc.consultarlupamunicipio.response.ListaConsultarLupaMunicipio) 

    /**
     * Method addListaConsultarLupaMunicipio
     * 
     * 
     * 
     * @param index
     * @param vListaConsultarLupaMunicipio
     */
    public void addListaConsultarLupaMunicipio(int index, br.com.bradesco.web.giss.service.data.pdc.consultarlupamunicipio.response.ListaConsultarLupaMunicipio vListaConsultarLupaMunicipio)
        throws java.lang.IndexOutOfBoundsException
    {
        _listaConsultarLupaMunicipioList.insertElementAt(vListaConsultarLupaMunicipio, index);
    } //-- void addListaConsultarLupaMunicipio(int, br.com.bradesco.web.giss.service.data.pdc.consultarlupamunicipio.response.ListaConsultarLupaMunicipio) 

    /**
     * Method deleteQuantOcorrencia
     * 
     */
    public void deleteQuantOcorrencia()
    {
        this._has_quantOcorrencia= false;
    } //-- void deleteQuantOcorrencia() 

    /**
     * Method enumerateListaConsultarLupaMunicipio
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateListaConsultarLupaMunicipio()
    {
        return _listaConsultarLupaMunicipioList.elements();
    } //-- java.util.Enumeration enumerateListaConsultarLupaMunicipio() 

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
     * Returns the value of field 'codPaisIrecp'.
     * 
     * @return String
     * @return the value of field 'codPaisIrecp'.
     */
    public java.lang.String getCodPaisIrecp()
    {
        return this._codPaisIrecp;
    } //-- java.lang.String getCodPaisIrecp() 

    /**
     * Method getListaConsultarLupaMunicipio
     * 
     * 
     * 
     * @param index
     * @return ListaConsultarLupaMunicipio
     */
    public br.com.bradesco.web.giss.service.data.pdc.consultarlupamunicipio.response.ListaConsultarLupaMunicipio getListaConsultarLupaMunicipio(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaConsultarLupaMunicipioList.size())) {
            throw new IndexOutOfBoundsException("getListaConsultarLupaMunicipio: Index value '"+index+"' not in range [0.."+(_listaConsultarLupaMunicipioList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.consultarlupamunicipio.response.ListaConsultarLupaMunicipio) _listaConsultarLupaMunicipioList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultarlupamunicipio.response.ListaConsultarLupaMunicipio getListaConsultarLupaMunicipio(int) 

    /**
     * Method getListaConsultarLupaMunicipio
     * 
     * 
     * 
     * @return ListaConsultarLupaMunicipio
     */
    public br.com.bradesco.web.giss.service.data.pdc.consultarlupamunicipio.response.ListaConsultarLupaMunicipio[] getListaConsultarLupaMunicipio()
    {
        int size = _listaConsultarLupaMunicipioList.size();
        br.com.bradesco.web.giss.service.data.pdc.consultarlupamunicipio.response.ListaConsultarLupaMunicipio[] mArray = new br.com.bradesco.web.giss.service.data.pdc.consultarlupamunicipio.response.ListaConsultarLupaMunicipio[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.consultarlupamunicipio.response.ListaConsultarLupaMunicipio) _listaConsultarLupaMunicipioList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultarlupamunicipio.response.ListaConsultarLupaMunicipio[] getListaConsultarLupaMunicipio() 

    /**
     * Method getListaConsultarLupaMunicipioCount
     * 
     * 
     * 
     * @return int
     */
    public int getListaConsultarLupaMunicipioCount()
    {
        return _listaConsultarLupaMunicipioList.size();
    } //-- int getListaConsultarLupaMunicipioCount() 

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
     * Returns the value of field 'pais'.
     * 
     * @return String
     * @return the value of field 'pais'.
     */
    public java.lang.String getPais()
    {
        return this._pais;
    } //-- java.lang.String getPais() 

    /**
     * Returns the value of field 'quantOcorrencia'.
     * 
     * @return int
     * @return the value of field 'quantOcorrencia'.
     */
    public int getQuantOcorrencia()
    {
        return this._quantOcorrencia;
    } //-- int getQuantOcorrencia() 

    /**
     * Method hasQuantOcorrencia
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasQuantOcorrencia()
    {
        return this._has_quantOcorrencia;
    } //-- boolean hasQuantOcorrencia() 

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
     * Method removeAllListaConsultarLupaMunicipio
     * 
     */
    public void removeAllListaConsultarLupaMunicipio()
    {
        _listaConsultarLupaMunicipioList.removeAllElements();
    } //-- void removeAllListaConsultarLupaMunicipio() 

    /**
     * Method removeListaConsultarLupaMunicipio
     * 
     * 
     * 
     * @param index
     * @return ListaConsultarLupaMunicipio
     */
    public br.com.bradesco.web.giss.service.data.pdc.consultarlupamunicipio.response.ListaConsultarLupaMunicipio removeListaConsultarLupaMunicipio(int index)
    {
        java.lang.Object obj = _listaConsultarLupaMunicipioList.elementAt(index);
        _listaConsultarLupaMunicipioList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.consultarlupamunicipio.response.ListaConsultarLupaMunicipio) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultarlupamunicipio.response.ListaConsultarLupaMunicipio removeListaConsultarLupaMunicipio(int) 

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
     * Sets the value of field 'codPaisIrecp'.
     * 
     * @param codPaisIrecp the value of field 'codPaisIrecp'.
     */
    public void setCodPaisIrecp(java.lang.String codPaisIrecp)
    {
        this._codPaisIrecp = codPaisIrecp;
    } //-- void setCodPaisIrecp(java.lang.String) 

    /**
     * Method setListaConsultarLupaMunicipio
     * 
     * 
     * 
     * @param index
     * @param vListaConsultarLupaMunicipio
     */
    public void setListaConsultarLupaMunicipio(int index, br.com.bradesco.web.giss.service.data.pdc.consultarlupamunicipio.response.ListaConsultarLupaMunicipio vListaConsultarLupaMunicipio)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaConsultarLupaMunicipioList.size())) {
            throw new IndexOutOfBoundsException("setListaConsultarLupaMunicipio: Index value '"+index+"' not in range [0.." + (_listaConsultarLupaMunicipioList.size() - 1) + "]");
        }
        _listaConsultarLupaMunicipioList.setElementAt(vListaConsultarLupaMunicipio, index);
    } //-- void setListaConsultarLupaMunicipio(int, br.com.bradesco.web.giss.service.data.pdc.consultarlupamunicipio.response.ListaConsultarLupaMunicipio) 

    /**
     * Method setListaConsultarLupaMunicipio
     * 
     * 
     * 
     * @param listaConsultarLupaMunicipioArray
     */
    public void setListaConsultarLupaMunicipio(br.com.bradesco.web.giss.service.data.pdc.consultarlupamunicipio.response.ListaConsultarLupaMunicipio[] listaConsultarLupaMunicipioArray)
    {
        //-- copy array
        _listaConsultarLupaMunicipioList.removeAllElements();
        for (int i = 0; i < listaConsultarLupaMunicipioArray.length; i++) {
            _listaConsultarLupaMunicipioList.addElement(listaConsultarLupaMunicipioArray[i]);
        }
    } //-- void setListaConsultarLupaMunicipio(br.com.bradesco.web.giss.service.data.pdc.consultarlupamunicipio.response.ListaConsultarLupaMunicipio) 

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
     * Sets the value of field 'pais'.
     * 
     * @param pais the value of field 'pais'.
     */
    public void setPais(java.lang.String pais)
    {
        this._pais = pais;
    } //-- void setPais(java.lang.String) 

    /**
     * Sets the value of field 'quantOcorrencia'.
     * 
     * @param quantOcorrencia the value of field 'quantOcorrencia'.
     */
    public void setQuantOcorrencia(int quantOcorrencia)
    {
        this._quantOcorrencia = quantOcorrencia;
        this._has_quantOcorrencia = true;
    } //-- void setQuantOcorrencia(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ConsultarLupaMunicipioResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.consultarlupamunicipio.response.ConsultarLupaMunicipioResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.consultarlupamunicipio.response.ConsultarLupaMunicipioResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.consultarlupamunicipio.response.ConsultarLupaMunicipioResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultarlupamunicipio.response.ConsultarLupaMunicipioResponse unmarshal(java.io.Reader) 

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
