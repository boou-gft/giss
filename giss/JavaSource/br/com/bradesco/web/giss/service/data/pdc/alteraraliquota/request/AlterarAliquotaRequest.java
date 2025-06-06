/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: AlterarAliquotaRequest.java,v 1.2 2017/12/07 13:39:25 gabrielmarani Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.alteraraliquota.request;

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
 * Class AlterarAliquotaRequest.
 * 
 * @version $Revision: 1.2 $ $Date: 2017/12/07 13:39:25 $
 */
public class AlterarAliquotaRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _listaAlterarAliquotaList
     */
    private java.util.Vector _listaAlterarAliquotaList;

    /**
     * Field _codUsuarioManutencao
     */
    private java.lang.String _codUsuarioManutencao;


      //----------------/
     //- Constructors -/
    //----------------/

    public AlterarAliquotaRequest() 
     {
        super();
        _listaAlterarAliquotaList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.alteraraliquota.request.AlterarAliquotaRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addListaAlterarAliquota
     * 
     * 
     * 
     * @param vListaAlterarAliquota
     */
    public void addListaAlterarAliquota(br.com.bradesco.web.giss.service.data.pdc.alteraraliquota.request.ListaAlterarAliquota vListaAlterarAliquota)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_listaAlterarAliquotaList.size() < 100)) {
            throw new IndexOutOfBoundsException("addListaAlterarAliquota has a maximum of 100");
        }
        _listaAlterarAliquotaList.addElement(vListaAlterarAliquota);
    } //-- void addListaAlterarAliquota(br.com.bradesco.web.giss.service.data.pdc.alteraraliquota.request.ListaAlterarAliquota) 

    /**
     * Method addListaAlterarAliquota
     * 
     * 
     * 
     * @param index
     * @param vListaAlterarAliquota
     */
    public void addListaAlterarAliquota(int index, br.com.bradesco.web.giss.service.data.pdc.alteraraliquota.request.ListaAlterarAliquota vListaAlterarAliquota)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_listaAlterarAliquotaList.size() < 100)) {
            throw new IndexOutOfBoundsException("addListaAlterarAliquota has a maximum of 100");
        }
        _listaAlterarAliquotaList.insertElementAt(vListaAlterarAliquota, index);
    } //-- void addListaAlterarAliquota(int, br.com.bradesco.web.giss.service.data.pdc.alteraraliquota.request.ListaAlterarAliquota) 

    /**
     * Method enumerateListaAlterarAliquota
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateListaAlterarAliquota()
    {
        return _listaAlterarAliquotaList.elements();
    } //-- java.util.Enumeration enumerateListaAlterarAliquota() 

    /**
     * Returns the value of field 'codUsuarioManutencao'.
     * 
     * @return String
     * @return the value of field 'codUsuarioManutencao'.
     */
    public java.lang.String getCodUsuarioManutencao()
    {
        return this._codUsuarioManutencao;
    } //-- java.lang.String getCodUsuarioManutencao() 

    /**
     * Method getListaAlterarAliquota
     * 
     * 
     * 
     * @param index
     * @return ListaAlterarAliquota
     */
    public br.com.bradesco.web.giss.service.data.pdc.alteraraliquota.request.ListaAlterarAliquota getListaAlterarAliquota(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaAlterarAliquotaList.size())) {
            throw new IndexOutOfBoundsException("getListaAlterarAliquota: Index value '"+index+"' not in range [0.."+(_listaAlterarAliquotaList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.alteraraliquota.request.ListaAlterarAliquota) _listaAlterarAliquotaList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.alteraraliquota.request.ListaAlterarAliquota getListaAlterarAliquota(int) 

    /**
     * Method getListaAlterarAliquota
     * 
     * 
     * 
     * @return ListaAlterarAliquota
     */
    public br.com.bradesco.web.giss.service.data.pdc.alteraraliquota.request.ListaAlterarAliquota[] getListaAlterarAliquota()
    {
        int size = _listaAlterarAliquotaList.size();
        br.com.bradesco.web.giss.service.data.pdc.alteraraliquota.request.ListaAlterarAliquota[] mArray = new br.com.bradesco.web.giss.service.data.pdc.alteraraliquota.request.ListaAlterarAliquota[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.alteraraliquota.request.ListaAlterarAliquota) _listaAlterarAliquotaList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.alteraraliquota.request.ListaAlterarAliquota[] getListaAlterarAliquota() 

    /**
     * Method getListaAlterarAliquotaCount
     * 
     * 
     * 
     * @return int
     */
    public int getListaAlterarAliquotaCount()
    {
        return _listaAlterarAliquotaList.size();
    } //-- int getListaAlterarAliquotaCount() 

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
     * Method removeAllListaAlterarAliquota
     * 
     */
    public void removeAllListaAlterarAliquota()
    {
        _listaAlterarAliquotaList.removeAllElements();
    } //-- void removeAllListaAlterarAliquota() 

    /**
     * Method removeListaAlterarAliquota
     * 
     * 
     * 
     * @param index
     * @return ListaAlterarAliquota
     */
    public br.com.bradesco.web.giss.service.data.pdc.alteraraliquota.request.ListaAlterarAliquota removeListaAlterarAliquota(int index)
    {
        java.lang.Object obj = _listaAlterarAliquotaList.elementAt(index);
        _listaAlterarAliquotaList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.alteraraliquota.request.ListaAlterarAliquota) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.alteraraliquota.request.ListaAlterarAliquota removeListaAlterarAliquota(int) 

    /**
     * Sets the value of field 'codUsuarioManutencao'.
     * 
     * @param codUsuarioManutencao the value of field
     * 'codUsuarioManutencao'.
     */
    public void setCodUsuarioManutencao(java.lang.String codUsuarioManutencao)
    {
        this._codUsuarioManutencao = codUsuarioManutencao;
    } //-- void setCodUsuarioManutencao(java.lang.String) 

    /**
     * Method setListaAlterarAliquota
     * 
     * 
     * 
     * @param index
     * @param vListaAlterarAliquota
     */
    public void setListaAlterarAliquota(int index, br.com.bradesco.web.giss.service.data.pdc.alteraraliquota.request.ListaAlterarAliquota vListaAlterarAliquota)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaAlterarAliquotaList.size())) {
            throw new IndexOutOfBoundsException("setListaAlterarAliquota: Index value '"+index+"' not in range [0.." + (_listaAlterarAliquotaList.size() - 1) + "]");
        }
        if (!(index < 100)) {
            throw new IndexOutOfBoundsException("setListaAlterarAliquota has a maximum of 100");
        }
        _listaAlterarAliquotaList.setElementAt(vListaAlterarAliquota, index);
    } //-- void setListaAlterarAliquota(int, br.com.bradesco.web.giss.service.data.pdc.alteraraliquota.request.ListaAlterarAliquota) 

    /**
     * Method setListaAlterarAliquota
     * 
     * 
     * 
     * @param listaAlterarAliquotaArray
     */
    public void setListaAlterarAliquota(br.com.bradesco.web.giss.service.data.pdc.alteraraliquota.request.ListaAlterarAliquota[] listaAlterarAliquotaArray)
    {
        //-- copy array
        _listaAlterarAliquotaList.removeAllElements();
        for (int i = 0; i < listaAlterarAliquotaArray.length; i++) {
            _listaAlterarAliquotaList.addElement(listaAlterarAliquotaArray[i]);
        }
    } //-- void setListaAlterarAliquota(br.com.bradesco.web.giss.service.data.pdc.alteraraliquota.request.ListaAlterarAliquota) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return AlterarAliquotaRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.alteraraliquota.request.AlterarAliquotaRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.alteraraliquota.request.AlterarAliquotaRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.alteraraliquota.request.AlterarAliquotaRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.alteraraliquota.request.AlterarAliquotaRequest unmarshal(java.io.Reader) 

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
