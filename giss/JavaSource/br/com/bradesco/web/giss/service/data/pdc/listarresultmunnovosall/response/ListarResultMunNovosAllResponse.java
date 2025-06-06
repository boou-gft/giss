/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ListarResultMunNovosAllResponse.java,v 1.1 2018/06/14 10:16:04 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listarresultmunnovosall.response;

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
 * Class ListarResultMunNovosAllResponse.
 * 
 * @version $Revision: 1.1 $ $Date: 2018/06/14 10:16:04 $
 */
public class ListarResultMunNovosAllResponse implements java.io.Serializable {


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
     * Field _qtdeOcorrenciasList
     */
    private java.util.Vector _qtdeOcorrenciasList = null;

    /**
     * Field _listaResultMunNovosAllList
     */
    private java.util.Vector _listaResultMunNovosAllList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarResultMunNovosAllResponse() 
     {
        super();
        _qtdeOcorrenciasList = new Vector();
        _listaResultMunNovosAllList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarresultmunnovosall.response.ListarResultMunNovosAllResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addListaResultMunNovosAll
     * 
     * 
     * 
     * @param vListaResultMunNovosAll
     */
    public void addListaResultMunNovosAll(br.com.bradesco.web.giss.service.data.pdc.listarresultmunnovosall.response.ListaResultMunNovosAll vListaResultMunNovosAll)
        throws java.lang.IndexOutOfBoundsException
    {
        _listaResultMunNovosAllList.addElement(vListaResultMunNovosAll);
    } //-- void addListaResultMunNovosAll(br.com.bradesco.web.giss.service.data.pdc.listarresultmunnovosall.response.ListaResultMunNovosAll) 

    /**
     * Method addListaResultMunNovosAll
     * 
     * 
     * 
     * @param index
     * @param vListaResultMunNovosAll
     */
    public void addListaResultMunNovosAll(int index, br.com.bradesco.web.giss.service.data.pdc.listarresultmunnovosall.response.ListaResultMunNovosAll vListaResultMunNovosAll)
        throws java.lang.IndexOutOfBoundsException
    {
        _listaResultMunNovosAllList.insertElementAt(vListaResultMunNovosAll, index);
    } //-- void addListaResultMunNovosAll(int, br.com.bradesco.web.giss.service.data.pdc.listarresultmunnovosall.response.ListaResultMunNovosAll) 

    /**
     * Method addQtdeOcorrencias
     * 
     * 
     * 
     * @param vQtdeOcorrencias
     */
    public void addQtdeOcorrencias(int vQtdeOcorrencias)
        throws java.lang.IndexOutOfBoundsException
    {
        _qtdeOcorrenciasList.addElement(new java.lang.Integer(vQtdeOcorrencias));
    } //-- void addQtdeOcorrencias(int) 

    /**
     * Method addQtdeOcorrencias
     * 
     * 
     * 
     * @param index
     * @param vQtdeOcorrencias
     */
    public void addQtdeOcorrencias(int index, int vQtdeOcorrencias)
        throws java.lang.IndexOutOfBoundsException
    {
        _qtdeOcorrenciasList.insertElementAt(new java.lang.Integer(vQtdeOcorrencias), index);
    } //-- void addQtdeOcorrencias(int, int) 

    /**
     * Method enumerateListaResultMunNovosAll
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateListaResultMunNovosAll()
    {
        return _listaResultMunNovosAllList.elements();
    } //-- java.util.Enumeration enumerateListaResultMunNovosAll() 

    /**
     * Method enumerateQtdeOcorrencias
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateQtdeOcorrencias()
    {
        return _qtdeOcorrenciasList.elements();
    } //-- java.util.Enumeration enumerateQtdeOcorrencias() 

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
     * Method getListaResultMunNovosAll
     * 
     * 
     * 
     * @param index
     * @return ListaResultMunNovosAll
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarresultmunnovosall.response.ListaResultMunNovosAll getListaResultMunNovosAll(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaResultMunNovosAllList.size())) {
            throw new IndexOutOfBoundsException("getListaResultMunNovosAll: Index value '"+index+"' not in range [0.."+(_listaResultMunNovosAllList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.listarresultmunnovosall.response.ListaResultMunNovosAll) _listaResultMunNovosAllList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarresultmunnovosall.response.ListaResultMunNovosAll getListaResultMunNovosAll(int) 

    /**
     * Method getListaResultMunNovosAll
     * 
     * 
     * 
     * @return ListaResultMunNovosAll
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarresultmunnovosall.response.ListaResultMunNovosAll[] getListaResultMunNovosAll()
    {
        int size = _listaResultMunNovosAllList.size();
        br.com.bradesco.web.giss.service.data.pdc.listarresultmunnovosall.response.ListaResultMunNovosAll[] mArray = new br.com.bradesco.web.giss.service.data.pdc.listarresultmunnovosall.response.ListaResultMunNovosAll[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.listarresultmunnovosall.response.ListaResultMunNovosAll) _listaResultMunNovosAllList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarresultmunnovosall.response.ListaResultMunNovosAll[] getListaResultMunNovosAll() 

    /**
     * Method getListaResultMunNovosAllCount
     * 
     * 
     * 
     * @return int
     */
    public int getListaResultMunNovosAllCount()
    {
        return _listaResultMunNovosAllList.size();
    } //-- int getListaResultMunNovosAllCount() 

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
     * Method getQtdeOcorrencias
     * 
     * 
     * 
     * @param index
     * @return int
     */
    public int getQtdeOcorrencias(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _qtdeOcorrenciasList.size())) {
            throw new IndexOutOfBoundsException("getQtdeOcorrencias: Index value '"+index+"' not in range [0.."+(_qtdeOcorrenciasList.size() - 1) + "]");
        }
        
        return ((java.lang.Integer)_qtdeOcorrenciasList.elementAt(index)).intValue();
    } //-- int getQtdeOcorrencias(int) 

    /**
     * Method getQtdeOcorrencias
     * 
     * 
     * 
     * @return int
     */
    public int[] getQtdeOcorrencias()
    {
        int size = _qtdeOcorrenciasList.size();
        int[] mArray = new int[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = ((java.lang.Integer)_qtdeOcorrenciasList.elementAt(index)).intValue();
        }
        return mArray;
    } //-- int[] getQtdeOcorrencias() 

    /**
     * Method getQtdeOcorrenciasCount
     * 
     * 
     * 
     * @return int
     */
    public int getQtdeOcorrenciasCount()
    {
        return _qtdeOcorrenciasList.size();
    } //-- int getQtdeOcorrenciasCount() 

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
     * Method removeAllListaResultMunNovosAll
     * 
     */
    public void removeAllListaResultMunNovosAll()
    {
        _listaResultMunNovosAllList.removeAllElements();
    } //-- void removeAllListaResultMunNovosAll() 

    /**
     * Method removeAllQtdeOcorrencias
     * 
     */
    public void removeAllQtdeOcorrencias()
    {
        _qtdeOcorrenciasList.removeAllElements();
    } //-- void removeAllQtdeOcorrencias() 

    /**
     * Method removeListaResultMunNovosAll
     * 
     * 
     * 
     * @param index
     * @return ListaResultMunNovosAll
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarresultmunnovosall.response.ListaResultMunNovosAll removeListaResultMunNovosAll(int index)
    {
        java.lang.Object obj = _listaResultMunNovosAllList.elementAt(index);
        _listaResultMunNovosAllList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.listarresultmunnovosall.response.ListaResultMunNovosAll) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarresultmunnovosall.response.ListaResultMunNovosAll removeListaResultMunNovosAll(int) 

    /**
     * Method removeQtdeOcorrencias
     * 
     * 
     * 
     * @param index
     * @return int
     */
    public int removeQtdeOcorrencias(int index)
    {
        java.lang.Object obj = _qtdeOcorrenciasList.elementAt(index);
        _qtdeOcorrenciasList.removeElementAt(index);
        return ((java.lang.Integer)obj).intValue();
    } //-- int removeQtdeOcorrencias(int) 

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
     * Method setListaResultMunNovosAll
     * 
     * 
     * 
     * @param index
     * @param vListaResultMunNovosAll
     */
    public void setListaResultMunNovosAll(int index, br.com.bradesco.web.giss.service.data.pdc.listarresultmunnovosall.response.ListaResultMunNovosAll vListaResultMunNovosAll)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaResultMunNovosAllList.size())) {
            throw new IndexOutOfBoundsException("setListaResultMunNovosAll: Index value '"+index+"' not in range [0.." + (_listaResultMunNovosAllList.size() - 1) + "]");
        }
        _listaResultMunNovosAllList.setElementAt(vListaResultMunNovosAll, index);
    } //-- void setListaResultMunNovosAll(int, br.com.bradesco.web.giss.service.data.pdc.listarresultmunnovosall.response.ListaResultMunNovosAll) 

    /**
     * Method setListaResultMunNovosAll
     * 
     * 
     * 
     * @param listaResultMunNovosAllArray
     */
    public void setListaResultMunNovosAll(br.com.bradesco.web.giss.service.data.pdc.listarresultmunnovosall.response.ListaResultMunNovosAll[] listaResultMunNovosAllArray)
    {
        //-- copy array
        _listaResultMunNovosAllList.removeAllElements();
        for (int i = 0; i < listaResultMunNovosAllArray.length; i++) {
            _listaResultMunNovosAllList.addElement(listaResultMunNovosAllArray[i]);
        }
    } //-- void setListaResultMunNovosAll(br.com.bradesco.web.giss.service.data.pdc.listarresultmunnovosall.response.ListaResultMunNovosAll) 

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
     * Method setQtdeOcorrencias
     * 
     * 
     * 
     * @param index
     * @param vQtdeOcorrencias
     */
    public void setQtdeOcorrencias(int index, int vQtdeOcorrencias)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _qtdeOcorrenciasList.size())) {
            throw new IndexOutOfBoundsException("setQtdeOcorrencias: Index value '"+index+"' not in range [0.." + (_qtdeOcorrenciasList.size() - 1) + "]");
        }
        _qtdeOcorrenciasList.setElementAt(new java.lang.Integer(vQtdeOcorrencias), index);
    } //-- void setQtdeOcorrencias(int, int) 

    /**
     * Method setQtdeOcorrencias
     * 
     * 
     * 
     * @param qtdeOcorrenciasArray
     */
    public void setQtdeOcorrencias(int[] qtdeOcorrenciasArray)
    {
        //-- copy array
        _qtdeOcorrenciasList.removeAllElements();
        for (int i = 0; i < qtdeOcorrenciasArray.length; i++) {
            _qtdeOcorrenciasList.addElement(new java.lang.Integer(qtdeOcorrenciasArray[i]));
        }
    } //-- void setQtdeOcorrencias(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListarResultMunNovosAllResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarresultmunnovosall.response.ListarResultMunNovosAllResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarresultmunnovosall.response.ListarResultMunNovosAllResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarresultmunnovosall.response.ListarResultMunNovosAllResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarresultmunnovosall.response.ListarResultMunNovosAllResponse unmarshal(java.io.Reader) 

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
