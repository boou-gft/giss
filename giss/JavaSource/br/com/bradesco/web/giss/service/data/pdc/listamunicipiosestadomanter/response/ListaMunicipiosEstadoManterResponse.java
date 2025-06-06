/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ListaMunicipiosEstadoManterResponse.java,v 1.2 2017/06/05 15:06:08 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listamunicipiosestadomanter.response;

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
 * Class ListaMunicipiosEstadoManterResponse.
 * 
 * @version $Revision: 1.2 $ $Date: 2017/06/05 15:06:08 $
 */
public class ListaMunicipiosEstadoManterResponse implements java.io.Serializable {


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
     * Field _legislacoesList
     */
    private java.util.Vector _legislacoesList;

    /**
     * Field _qtdeRegistros
     */
    private int _qtdeRegistros = 0;

    /**
     * keeps track of state for field: _qtdeRegistros
     */
    private boolean _has_qtdeRegistros;

    /**
     * Field _ocorrenciasMunManterList
     */
    private java.util.Vector _ocorrenciasMunManterList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListaMunicipiosEstadoManterResponse() 
     {
        super();
        _legislacoesList = new Vector();
        _ocorrenciasMunManterList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listamunicipiosestadomanter.response.ListaMunicipiosEstadoManterResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addLegislacoes
     * 
     * 
     * 
     * @param vLegislacoes
     */
    public void addLegislacoes(br.com.bradesco.web.giss.service.data.pdc.listamunicipiosestadomanter.response.Legislacoes vLegislacoes)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_legislacoesList.size() < 30)) {
            throw new IndexOutOfBoundsException("addLegislacoes has a maximum of 30");
        }
        _legislacoesList.addElement(vLegislacoes);
    } //-- void addLegislacoes(br.com.bradesco.web.giss.service.data.pdc.listamunicipiosestadomanter.response.Legislacoes) 

    /**
     * Method addLegislacoes
     * 
     * 
     * 
     * @param index
     * @param vLegislacoes
     */
    public void addLegislacoes(int index, br.com.bradesco.web.giss.service.data.pdc.listamunicipiosestadomanter.response.Legislacoes vLegislacoes)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_legislacoesList.size() < 30)) {
            throw new IndexOutOfBoundsException("addLegislacoes has a maximum of 30");
        }
        _legislacoesList.insertElementAt(vLegislacoes, index);
    } //-- void addLegislacoes(int, br.com.bradesco.web.giss.service.data.pdc.listamunicipiosestadomanter.response.Legislacoes) 

    /**
     * Method addOcorrenciasMunManter
     * 
     * 
     * 
     * @param vOcorrenciasMunManter
     */
    public void addOcorrenciasMunManter(br.com.bradesco.web.giss.service.data.pdc.listamunicipiosestadomanter.response.OcorrenciasMunManter vOcorrenciasMunManter)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_ocorrenciasMunManterList.size() < 200)) {
            throw new IndexOutOfBoundsException("addOcorrenciasMunManter has a maximum of 200");
        }
        _ocorrenciasMunManterList.addElement(vOcorrenciasMunManter);
    } //-- void addOcorrenciasMunManter(br.com.bradesco.web.giss.service.data.pdc.listamunicipiosestadomanter.response.OcorrenciasMunManter) 

    /**
     * Method addOcorrenciasMunManter
     * 
     * 
     * 
     * @param index
     * @param vOcorrenciasMunManter
     */
    public void addOcorrenciasMunManter(int index, br.com.bradesco.web.giss.service.data.pdc.listamunicipiosestadomanter.response.OcorrenciasMunManter vOcorrenciasMunManter)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_ocorrenciasMunManterList.size() < 200)) {
            throw new IndexOutOfBoundsException("addOcorrenciasMunManter has a maximum of 200");
        }
        _ocorrenciasMunManterList.insertElementAt(vOcorrenciasMunManter, index);
    } //-- void addOcorrenciasMunManter(int, br.com.bradesco.web.giss.service.data.pdc.listamunicipiosestadomanter.response.OcorrenciasMunManter) 

    /**
     * Method deleteQtdeRegistros
     * 
     */
    public void deleteQtdeRegistros()
    {
        this._has_qtdeRegistros= false;
    } //-- void deleteQtdeRegistros() 

    /**
     * Method enumerateLegislacoes
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateLegislacoes()
    {
        return _legislacoesList.elements();
    } //-- java.util.Enumeration enumerateLegislacoes() 

    /**
     * Method enumerateOcorrenciasMunManter
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateOcorrenciasMunManter()
    {
        return _ocorrenciasMunManterList.elements();
    } //-- java.util.Enumeration enumerateOcorrenciasMunManter() 

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
     * Method getLegislacoes
     * 
     * 
     * 
     * @param index
     * @return Legislacoes
     */
    public br.com.bradesco.web.giss.service.data.pdc.listamunicipiosestadomanter.response.Legislacoes getLegislacoes(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _legislacoesList.size())) {
            throw new IndexOutOfBoundsException("getLegislacoes: Index value '"+index+"' not in range [0.."+(_legislacoesList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.listamunicipiosestadomanter.response.Legislacoes) _legislacoesList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listamunicipiosestadomanter.response.Legislacoes getLegislacoes(int) 

    /**
     * Method getLegislacoes
     * 
     * 
     * 
     * @return Legislacoes
     */
    public br.com.bradesco.web.giss.service.data.pdc.listamunicipiosestadomanter.response.Legislacoes[] getLegislacoes()
    {
        int size = _legislacoesList.size();
        br.com.bradesco.web.giss.service.data.pdc.listamunicipiosestadomanter.response.Legislacoes[] mArray = new br.com.bradesco.web.giss.service.data.pdc.listamunicipiosestadomanter.response.Legislacoes[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.listamunicipiosestadomanter.response.Legislacoes) _legislacoesList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listamunicipiosestadomanter.response.Legislacoes[] getLegislacoes() 

    /**
     * Method getLegislacoesCount
     * 
     * 
     * 
     * @return int
     */
    public int getLegislacoesCount()
    {
        return _legislacoesList.size();
    } //-- int getLegislacoesCount() 

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
     * Method getOcorrenciasMunManter
     * 
     * 
     * 
     * @param index
     * @return OcorrenciasMunManter
     */
    public br.com.bradesco.web.giss.service.data.pdc.listamunicipiosestadomanter.response.OcorrenciasMunManter getOcorrenciasMunManter(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _ocorrenciasMunManterList.size())) {
            throw new IndexOutOfBoundsException("getOcorrenciasMunManter: Index value '"+index+"' not in range [0.."+(_ocorrenciasMunManterList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.listamunicipiosestadomanter.response.OcorrenciasMunManter) _ocorrenciasMunManterList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listamunicipiosestadomanter.response.OcorrenciasMunManter getOcorrenciasMunManter(int) 

    /**
     * Method getOcorrenciasMunManter
     * 
     * 
     * 
     * @return OcorrenciasMunManter
     */
    public br.com.bradesco.web.giss.service.data.pdc.listamunicipiosestadomanter.response.OcorrenciasMunManter[] getOcorrenciasMunManter()
    {
        int size = _ocorrenciasMunManterList.size();
        br.com.bradesco.web.giss.service.data.pdc.listamunicipiosestadomanter.response.OcorrenciasMunManter[] mArray = new br.com.bradesco.web.giss.service.data.pdc.listamunicipiosestadomanter.response.OcorrenciasMunManter[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.listamunicipiosestadomanter.response.OcorrenciasMunManter) _ocorrenciasMunManterList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listamunicipiosestadomanter.response.OcorrenciasMunManter[] getOcorrenciasMunManter() 

    /**
     * Method getOcorrenciasMunManterCount
     * 
     * 
     * 
     * @return int
     */
    public int getOcorrenciasMunManterCount()
    {
        return _ocorrenciasMunManterList.size();
    } //-- int getOcorrenciasMunManterCount() 

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
     * Method removeAllLegislacoes
     * 
     */
    public void removeAllLegislacoes()
    {
        _legislacoesList.removeAllElements();
    } //-- void removeAllLegislacoes() 

    /**
     * Method removeAllOcorrenciasMunManter
     * 
     */
    public void removeAllOcorrenciasMunManter()
    {
        _ocorrenciasMunManterList.removeAllElements();
    } //-- void removeAllOcorrenciasMunManter() 

    /**
     * Method removeLegislacoes
     * 
     * 
     * 
     * @param index
     * @return Legislacoes
     */
    public br.com.bradesco.web.giss.service.data.pdc.listamunicipiosestadomanter.response.Legislacoes removeLegislacoes(int index)
    {
        java.lang.Object obj = _legislacoesList.elementAt(index);
        _legislacoesList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.listamunicipiosestadomanter.response.Legislacoes) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listamunicipiosestadomanter.response.Legislacoes removeLegislacoes(int) 

    /**
     * Method removeOcorrenciasMunManter
     * 
     * 
     * 
     * @param index
     * @return OcorrenciasMunManter
     */
    public br.com.bradesco.web.giss.service.data.pdc.listamunicipiosestadomanter.response.OcorrenciasMunManter removeOcorrenciasMunManter(int index)
    {
        java.lang.Object obj = _ocorrenciasMunManterList.elementAt(index);
        _ocorrenciasMunManterList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.listamunicipiosestadomanter.response.OcorrenciasMunManter) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listamunicipiosestadomanter.response.OcorrenciasMunManter removeOcorrenciasMunManter(int) 

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
     * Method setLegislacoes
     * 
     * 
     * 
     * @param index
     * @param vLegislacoes
     */
    public void setLegislacoes(int index, br.com.bradesco.web.giss.service.data.pdc.listamunicipiosestadomanter.response.Legislacoes vLegislacoes)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _legislacoesList.size())) {
            throw new IndexOutOfBoundsException("setLegislacoes: Index value '"+index+"' not in range [0.." + (_legislacoesList.size() - 1) + "]");
        }
        if (!(index < 30)) {
            throw new IndexOutOfBoundsException("setLegislacoes has a maximum of 30");
        }
        _legislacoesList.setElementAt(vLegislacoes, index);
    } //-- void setLegislacoes(int, br.com.bradesco.web.giss.service.data.pdc.listamunicipiosestadomanter.response.Legislacoes) 

    /**
     * Method setLegislacoes
     * 
     * 
     * 
     * @param legislacoesArray
     */
    public void setLegislacoes(br.com.bradesco.web.giss.service.data.pdc.listamunicipiosestadomanter.response.Legislacoes[] legislacoesArray)
    {
        //-- copy array
        _legislacoesList.removeAllElements();
        for (int i = 0; i < legislacoesArray.length; i++) {
            _legislacoesList.addElement(legislacoesArray[i]);
        }
    } //-- void setLegislacoes(br.com.bradesco.web.giss.service.data.pdc.listamunicipiosestadomanter.response.Legislacoes) 

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
     * Method setOcorrenciasMunManter
     * 
     * 
     * 
     * @param index
     * @param vOcorrenciasMunManter
     */
    public void setOcorrenciasMunManter(int index, br.com.bradesco.web.giss.service.data.pdc.listamunicipiosestadomanter.response.OcorrenciasMunManter vOcorrenciasMunManter)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _ocorrenciasMunManterList.size())) {
            throw new IndexOutOfBoundsException("setOcorrenciasMunManter: Index value '"+index+"' not in range [0.." + (_ocorrenciasMunManterList.size() - 1) + "]");
        }
        if (!(index < 200)) {
            throw new IndexOutOfBoundsException("setOcorrenciasMunManter has a maximum of 200");
        }
        _ocorrenciasMunManterList.setElementAt(vOcorrenciasMunManter, index);
    } //-- void setOcorrenciasMunManter(int, br.com.bradesco.web.giss.service.data.pdc.listamunicipiosestadomanter.response.OcorrenciasMunManter) 

    /**
     * Method setOcorrenciasMunManter
     * 
     * 
     * 
     * @param ocorrenciasMunManterArray
     */
    public void setOcorrenciasMunManter(br.com.bradesco.web.giss.service.data.pdc.listamunicipiosestadomanter.response.OcorrenciasMunManter[] ocorrenciasMunManterArray)
    {
        //-- copy array
        _ocorrenciasMunManterList.removeAllElements();
        for (int i = 0; i < ocorrenciasMunManterArray.length; i++) {
            _ocorrenciasMunManterList.addElement(ocorrenciasMunManterArray[i]);
        }
    } //-- void setOcorrenciasMunManter(br.com.bradesco.web.giss.service.data.pdc.listamunicipiosestadomanter.response.OcorrenciasMunManter) 

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
     * @return ListaMunicipiosEstadoManterResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listamunicipiosestadomanter.response.ListaMunicipiosEstadoManterResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listamunicipiosestadomanter.response.ListaMunicipiosEstadoManterResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listamunicipiosestadomanter.response.ListaMunicipiosEstadoManterResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listamunicipiosestadomanter.response.ListaMunicipiosEstadoManterResponse unmarshal(java.io.Reader) 

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
